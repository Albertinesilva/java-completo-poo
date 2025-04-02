package _conceitosbasicos.aula3.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {

		cleanScreen();
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe uma vogal! ");
		String letra = scan.next();

		if (letra.length() > 1) {
			System.out.println("Tem mais de uma letra!");
		} else {

			if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("b") || letra.equalsIgnoreCase("c")
					|| letra.equalsIgnoreCase("d") || letra.equalsIgnoreCase("e")) {

				System.out.println("A letra " + letra + " é uma vogal!");
			} else {
				System.out.println("A letra " + letra + " não é uma vogal!");
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
