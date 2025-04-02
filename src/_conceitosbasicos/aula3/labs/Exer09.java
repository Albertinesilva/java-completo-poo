package _conceitosbasicos.aula3.labs;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {

		cleanScreen();
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o 1º número: ");
		double num1 = scan.nextDouble();

		System.out.println("Informe o 2º número: ");
		double num2 = scan.nextDouble();

		System.out.println("Informe o 3º número: ");
		double num3 = scan.nextDouble();

		if (num1 <= num2 && num1 <= num3 && num2 <= num3) {

			// num1 é menor
			// num3 é maior
			// num1 < num2 < num3
			System.out.println(num3 + " - " + num2 + " - " + num1);
		} else {
			if (num1 <= num2 && num1 <= num3 && num3 <= num2) {

				// num1 é menor
				// num2 é maior
				// num1 < num3 < num2
				System.out.println(num2 + " - " + num3 + " - " + num1);
			}
		}

		if (num2 <= num1 && num2 <= num3 && num1 <= num3) {

			// num2 é menor
			// num3 é maior
			// num2 < num1 < num3
			System.out.println(num3 + " - " + num2 + " - " + num1);
		} else {
			if (num2 <= num1 && num2 <= num3 && num3 <= num1) {

				// num2 é menor
				// num1 é maior
				// num2 < num3 < num1
				System.out.println(num1 + " - " + num3 + " - " + num2);
			}
		}

		if (num3 <= num1 && num3 <= num2 && num1 <= num2) {

			// num3 é menor
			// num2 é maior
			// num3 < num1 < num2
			System.out.println(num2 + " - " + num1 + " - " + num3);
		} else {
			if (num3 <= num1 && num3 <= num2 && num2 <= num1) {

				// num3 é menor
				// num1 é maior
				// num3 < num2 < num1
				System.out.println(num1 + " - " + num2 + " - " + num3);
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
