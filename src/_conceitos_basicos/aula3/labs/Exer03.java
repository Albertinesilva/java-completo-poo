package _conceitos_basicos.aula3.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {

		cleanScreen();
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com uma letar (F ou M)");

		String input = scan.next();

		if (input.equalsIgnoreCase("f")) {
			System.out.println("F - feminino");
		} else {
			if (input.equalsIgnoreCase("m")) {
				System.out.println("M - masculino");
			} else {
				System.out.println("Sexo invalido!");
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
