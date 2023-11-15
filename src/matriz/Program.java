package matriz;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.printf("\nInforme a quantidade de linhas e colunas: ");
        int n = scan.nextInt();

        int[][] mat = new int[n][n];

        for (int l = 0; l < mat.length; l++) {
            for (int c = 0; c < mat[l].length; c++) {
                mat[l][c] = scan.nextInt();
            }
        }

        System.out.printf("\nMain diagonal: ");
        for (int l = 0; l < mat.length; l++) {
            System.out.print(mat[l][l] + ", ");
        }

        System.out.printf("\nNegative numbers: ");
        int count = 0;

        for (int l = 0; l < mat.length; l++) {
            for (int c = 0; c < mat[l].length; c++) {
                if (mat[l][c] < 0) {
                    System.out.print(mat[l][c] + ", ");
                    count++;
                }
            }
        }
        System.out.printf("\nQuantidade de números negativos = " + count);

        scan.close();
    }
}
