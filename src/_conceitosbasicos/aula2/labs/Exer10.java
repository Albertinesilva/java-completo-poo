
package _conceitosbasicos.aula2.labs;

import java.util.Scanner;

public class Exer10 {

    public static void main(String[] args) {

        cleanScreen();
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a temperatura em Celsius: ");
        double c = scan.nextDouble();

        double f = c * 1.8 + 32;

        System.out.println("A temperatura " + c + " C é igual a " + f + "F");

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
