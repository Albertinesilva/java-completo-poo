package _conceitosbasicos.aula3.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {

		cleanScreen();
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o 1º número: ");
		int num = scan.nextInt();

		if (num < 0) {
			System.out.println("O número " + num + " é um número negativo!");
		} else {
			System.out.println("O número " + num + " é possitivo");
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
