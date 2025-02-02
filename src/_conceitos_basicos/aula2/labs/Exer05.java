
package _conceitos_basicos.aula2.labs;

import java.util.Scanner;

public class Exer05 {

    public static void main(String[] args) {

        cleanScreen();
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a quantidade de metros: ");

        double metros = scan.nextDouble();

        // 1m = 100 cm
        double cm = metros * 100;

        System.out.println(metros + " m é igual a " + cm + " cm");

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
