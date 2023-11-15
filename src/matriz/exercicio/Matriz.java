package matriz.exercicio;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.printf("\nInforme a Linha: ");
        int m = scan.nextInt();

        System.out.printf("Informe a Coluna: ");
        int n = scan.nextInt();

        int[][] mat = new int[m][n];

        for (int l = 0; l < mat.length; l++) {
            for (int c = 0; c < mat[l].length; c++) {
                mat[l][c] = scan.nextInt();
            }
        }
        System.out.printf("\n");

        for (int l = 0; l < mat.length; l++) {
            for (int c = 0; c < mat[l].length; c++) {
                System.out.printf("|%d", mat[l][c]);
            }
            System.out.printf("|\n");
        }

        System.out.printf("\nInforme um número: ");
        int x = scan.nextInt();

        System.out.printf("\nPosition ");
        for (int l = 0; l < mat.length; l++) {
            for (int c = 0; c < mat[l].length; c++) {
                if (mat[l][c] == x) {
                    System.out.printf("%d,", l);
                }
            }
        }
        System.out.println();

        for (int l = 0; l < mat.length; l++) {
            for (int c = 0; c < mat[l].length; c++) {
                if (mat[l][c] == x && c > 0) {
                    System.out.println("Left: " + mat[l][c - 1]);
                }
                if (mat[l][c] == x) {
                    System.out.println("Right: " + mat[l][c + 1]);
                    System.out.println("Down: " + mat[l + 1][c]);
                }
            }
        }

        scan.close();
    }
}
