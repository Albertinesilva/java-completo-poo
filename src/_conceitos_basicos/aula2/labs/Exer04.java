
package _conceitos_basicos.aula2.labs;

import java.util.Scanner;

public class Exer04 {

    public static void main(String[] args) {

        cleanScreen();
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a primeira nota: ");
        double nota1 = scan.nextDouble();

        System.out.println("Entre com a primeira nota: ");
        double nota2 = scan.nextDouble();

        System.out.println("Entre com a primeira nota: ");
        double nota3 = scan.nextDouble();

        System.out.println("Entre com a primeira nota: ");
        double nota4 = scan.nextDouble();

        double resultado = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Resultado da média entre 4 números = " + resultado);

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
