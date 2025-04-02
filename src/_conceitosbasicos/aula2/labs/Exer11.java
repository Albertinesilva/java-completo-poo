
package _conceitosbasicos.aula2.labs;

import java.util.Scanner;

public class Exer11 {

    public static void main(String[] args) {

        cleanScreen();
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o número inteiro: ");
        int num1 = scan.nextInt();

        System.out.println("Entre com o segundo número inteiro: ");
        int num2 = scan.nextInt();

        System.out.println("Entre com um número real: ");
        double num3 = scan.nextDouble();

        int resultado1 = (num1 * 2) * (num2 / 2);
        double resultado2 = (num1 * 3) + num3;
        double resultado3 = Math.pow(num3, 3);

        System.out.println("Resultado 1 " + resultado1);
        System.out.println("Resultado 2 " + resultado2);
        System.out.println("Resultado 3 " + resultado3);

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
