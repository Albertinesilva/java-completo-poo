package _conceitosbasicos.aula5.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {

		cleanScreen();
		Scanner scan = new Scanner(System.in);

		double popA = 0;
		double popB = 0;
		double taxaA = 0;
		double taxaB = 0;
		boolean valido = false;

		while (!valido) {

			System.out.println("Entre com a população A: ");
			popA = scan.nextDouble();

			if (popA > 0) {
				valido = true;

			} else {
				System.out.println("População A precisa ser maior que 0!");
			}

		}

		valido = false;
		while (!valido) {

			System.out.println("Entre com a população B: ");
			popB = scan.nextDouble();

			if (popB > 0) {
				valido = true;

			} else {
				System.out.println("População B precisa ser maior que 0!");
			}

		}

		valido = false;
		while (!valido) {

			System.out.println("Entre com a taxa de crescimento da população A: ");
			taxaA = scan.nextDouble();

			if (taxaA > 0) {
				valido = true;

			} else {
				System.out.println("Taxa de crescimento A precisa ser maior que 0!");
			}

		}

		valido = false;
		while (!valido) {

			System.out.println("Entre com a taxa de crescimento da população B: ");
			taxaB = scan.nextDouble();

			if (taxaB > 0) {
				valido = true;

			} else {
				System.out.println("Taxa de crescimento B precisa ser maior que 0!");
			}

		}

		int cont = 0;
		while (popA < popB) {

			popA += (popA / 100) * taxaA;
			popB += (popB / 100) * taxaB;
			cont++;
		}

		System.out.println("\nPopulação A: " + popA);
		System.out.println("População B: " + popB);
		System.out.println("Quantidade de anos: " + cont);

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
