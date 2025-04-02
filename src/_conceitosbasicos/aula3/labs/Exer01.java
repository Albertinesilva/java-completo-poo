package _conceitosbasicos.aula3.labs;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {

		cleanScreen();
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o 1º número: ");
		int num1 = scan.nextInt();

		System.out.println("Entre com o 2º número: ");
		int num2 = scan.nextInt();

		if (num1 > num2) {
			System.out.println("O 1º Número é Maior " + num1);
		} else {
			System.out.println("O 2º Número é Maior " + num2);
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
