package _conceitos_basicos.aula8.labs;

import java.util.Random;

public class Exer02 {

	public static void main(String[] args) {

		int[][] matriz = new int[10][10];
		Random gerador = new Random();

		for (int l = 0; l < matriz.length; l++) {

			for (int c = 0; c < matriz[l].length; c++) {
				matriz[l][c] = gerador.nextInt(100);
				System.out.print("|" + matriz[l][c] + "|");
			}
			System.out.print("\n");
		}

		int maiorL5 = Integer.MIN_VALUE;
		int menorL5 = Integer.MAX_VALUE;
		int maiorC7 = Integer.MIN_VALUE;
		int menorC7 = Integer.MAX_VALUE;

		for (int l = 0; l < matriz[5].length; l++) {

			if (matriz[5][l] > maiorL5) {

				maiorL5 = matriz[5][l];

			}
			if (matriz[5][l] < menorL5) {

				menorL5 = matriz[5][l];

			}
		}
		System.out.println("Maior valor da linha 5: " + maiorL5);
		System.out.println("Menor valor da linha 5: " + menorL5);
		
		for(int c = 0; c < matriz.length; c++) {
			if(matriz[c][7] > maiorC7) {
				maiorC7 = matriz[c][7];
			}
			if(matriz[c][7] < menorC7) {
				menorC7 = matriz[c][7];
			}
			
		}
		
		System.out.println("Maior valor da linha 7: " + maiorC7);
		System.out.println("Menor valor da linha 7: " + menorC7);

	}

}
