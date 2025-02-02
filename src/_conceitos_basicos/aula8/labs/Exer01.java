package _conceitos_basicos.aula8.labs;

import java.util.Random;

public class Exer01 {

	public static void main(String[] args) {

		int[][] matriz = new int[4][4];
		Random gerador = new Random();

		for (int l = 0; l < matriz.length; l++) {

			for (int c = 0; c < matriz.length; c++) {
				matriz[l][c] = gerador.nextInt(9);
				System.out.print("|" + matriz[l][c] + "|");
			}
			System.out.print("\n");
		}

		int maior = Integer.MIN_VALUE;
		int linha = 0;
		int coluna = 0;
		for (int l = 0; l < matriz.length; l++) {

			for (int c = 0; c < matriz.length; c++) {

				if (matriz[l][c] > maior) {

					maior = matriz[l][c];
					linha = l;
					coluna = c;
				}
			}
		}

		System.out.println("Maior n�mero: " + maior);
		System.out.println("Linha: " + linha);
		System.out.println("Coluna: " + coluna);
	}

}
