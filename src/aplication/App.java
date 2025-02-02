package aplication;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        cleanScreen();
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        double sum = 0.0;

        double[] vect = new double[n];

        while (n > 0) {

            vect[3 - n] = scan.nextDouble();
            sum += vect[3 - n];
            n--;

        }

        double avg = sum / vect.length;
        System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);

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
