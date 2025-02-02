package _conceitos_basicos.aula7.labs;

import java.util.Scanner;

public class Exer007 {

	public static void main(String[] args) {

		cleanScreen();
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Informe um número: ");
			vetorA[i] = scan.nextInt();

		}

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Informe um número: ");
			vetorB[i] = scan.nextInt();
			vetorC[i] = vetorA[i] - vetorB[i];

		}

		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {

			System.out.print(vetorA[i] + " ");
		}

		System.out.println();
		System.out.print("Vetor B = ");
		for (int i = 0; i < vetorA.length; i++) {

			System.out.print(vetorB[i] + " ");
		}

		System.out.println();
		System.out.print("Vetor C = ");
		for (int i = 0; i < vetorA.length; i++) {

			System.out.print(vetorC[i] + " ");
		}

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
