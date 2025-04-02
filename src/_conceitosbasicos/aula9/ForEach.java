package _conceitosbasicos.aula9;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {

		cleanScreen();

		int[] notas = new int[10];
		Random random = new Random();

		for (int i = 0; i < notas.length; i++) {
			notas[i] = random.nextInt(10);
		}

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Noras: " + notas[i]);
		}

		System.out.println("\nUsando o For Each");
		for (int nota : notas) {
			System.out.println("Noras: " + nota);
		}

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
