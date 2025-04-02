
package _conceitosbasicos.aula2.labs;

import java.util.Scanner;

public class Exer07 {

    public static void main(String[] args) {

        cleanScreen();
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o tamanho do lado do quadrado: ");
        double lado = scan.nextDouble();

        double area = Math.pow(lado, 2);

        System.out.println("A área do quadrado é: " + area);
        System.out.println("O dobro da área do quadrado é: " + (area * 2));

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
