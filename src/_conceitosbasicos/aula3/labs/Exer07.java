package _conceitosbasicos.aula3.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {

		cleanScreen();
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o 1º número: ");
		double num1 = scan.nextDouble();

		System.out.println("Informe o 2º número: ");
		double num2 = scan.nextDouble();

		System.out.println("Informe o 3º número: ");
		double num3 = scan.nextDouble();

		if (num1 >= num2 && num1 >= num3) {
			System.out.println("O número " + num1 + " é Maior!");
		} else {
			if (num2 >= num1 && num2 >= num3) {
				System.out.println("O número " + num2 + " é Maior!");

			} else {
				if (num3 >= num1 && num3 >= num2) {
					System.out.println("O número " + num3 + " é Maior!");
				}
			}
		}

		if (num1 <= num2 && num1 <= num3) {
			System.out.println("O número " + num1 + " é Menor!");
		} else {
			if (num2 <= num1 && num2 <= num3) {
				System.out.println("O número " + num2 + " é Menor!");

			} else {
				if (num3 <= num1 && num3 <= num2) {
					System.out.println("O número " + num3 + " é Menor!");
				}
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
