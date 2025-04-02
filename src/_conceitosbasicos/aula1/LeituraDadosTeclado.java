package _conceitosbasicos.aula1;

import java.util.Locale;
import java.util.Scanner;

public class LeituraDadosTeclado {

  public static void main(String[] args) {
    cleanScreen();
    Locale.setDefault(Locale.US);
    Scanner scan = new Scanner(System.in);

    /*
     * System.out.println("Digite seu nome completo: ");
     * String nomeCompleto = scan.nextLine();
     * 
     * System.out.println("\nSeu nome completo é: " + nomeCompleto);
     * 
     * System.out.println("\nDigite seu primeiro nome: ");
     * String primeiroNome = scan.next();
     * 
     * System.out.println("\nSeu primeiro nome é: " + primeiroNome);
     * 
     * 
     * System.out.println("Digite a sua idade: ");
     * int idade = scan.nextInt();
     * 
     * System.out.println("\nSua idade é: " + idade);
     * 
     * System.out.println("\nDigite a sua altura: ");
     * double altura = scan.nextDouble();
     * 
     * System.out.println("\nA sua altura é: " + altura);
     */

    System.out.println(
        "Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem bichinho de estimação: ");
    String primeiroNome = scan.next();
    int idade = scan.nextInt();
    byte quantFilhos = scan.nextByte();
    float altura = scan.nextFloat();
    boolean temPet = scan.nextBoolean();

    System.out.println("Você digitou os seguintes valores: ");

    System.out.println("Primeiro nome: " + primeiroNome);
    System.out.println("Idade: " + idade);
    System.out.println("Quantidade de filhos: " + quantFilhos);
    System.out.println("Altura: " + altura);
    System.out.println("Tem bichinho de estimação? " + temPet);

    scan.close();
  }

  public static void cleanScreen() {
    try {
      final String os = System.getProperty("os.name");

      if (os.contains("Windows")) {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
      } else {
        System.out.print("\033[H\033[2J");
        System.out.flush();
      }
    } catch (final Exception e) {
      // Trata exceções (pode ser uma exceção de interrupção)
      e.printStackTrace();
    }
  }

}
