package _conceitos_basicos.aula3.labs;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {

		cleanScreen();
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o ano");

		int ano = scan.nextInt();

		if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
			System.out.println("É bissexto!");

		} else {

			System.out.println("Não é bissexto!");
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
