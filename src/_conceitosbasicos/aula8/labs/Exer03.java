package _conceitosbasicos.aula8.labs;

import java.util.Random;

public class Exer03 {

	public static void main(String[] args) {

		cleanScreen();

		int[][] matriz = new int[3][3];
		Random gerador = new Random();

		for (int l = 0; l < matriz.length; l++) {

			for (int c = 0; c < matriz[l].length; c++) {
				matriz[l][c] = gerador.nextInt(9);
				System.out.print("|" + matriz[l][c] + "|");
			}
			System.out.print("\n");
		}

		int quantPar = 0;
		int quantImpar = 0;
		for (int l = 0; l < matriz.length; l++) {

			for (int c = 0; c < matriz[l].length; c++) {

				if (matriz[l][c] % 2 == 0) {
					quantPar++;
				} else {
					quantImpar++;
				}
			}
		}

		System.out.println("Quantidade de números pares: " + quantPar);
		System.out.println("Qauntidade de números impares: " + quantImpar);

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
