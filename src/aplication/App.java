package aplication;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        double sum = 0.0;

        double[] vect = new double[n];

        while (n > 0) {

            vect[3-n] = scan.nextDouble();
            sum += vect[3-n];
            n--;

        }

        double avg = sum / vect.length;
        System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);


        scan.close();

    }
}
