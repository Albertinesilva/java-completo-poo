package _conceitosbasicos.aula3.labs;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {

		cleanScreen();
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o valor de (a): ");
		int a = scan.nextInt();

		if (a == 0) {
			System.out.println("Não é equação de 1º Grau!");

		} else {
			System.out.println("Digite o valor de (b): ");
			int b = scan.nextInt();

			System.out.println("Digite o valor de (c): ");
			int c = scan.nextInt();

			double delta = (b * b) - (4 * a * c);
			if (delta < 0) {
				System.out.println("Delta negativo!");

			} else {

				System.out.println("Delta: " + delta);
				double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
				double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);

				System.out.println("X1 = " + x1 + "\nX2 = " + x2);
			}

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
