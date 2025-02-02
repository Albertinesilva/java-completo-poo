package _conceitos_basicos.aula3.labs;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {

		cleanScreen();
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com a quantidade (kg) de morango: ");
		int quantMorango = scan.nextInt();

		System.out.println("Entre com a quantidade (kg) de Maça: ");
		int quantMaca = scan.nextInt();

		double precoKgMorango = 0;
		if (quantMorango <= 5) {
			precoKgMorango = 2.5;

		} else {
			precoKgMorango = 2.2;
		}

		double precoKgMaca = 0;

		if (quantMaca <= 5) {
			precoKgMaca = 1.8;

		} else {
			precoKgMaca = 1.5;
		}

		double precoTotalMorango = quantMorango * precoKgMorango;
		double precoTotalMaca = quantMaca * precoKgMaca;

		System.out.println("Preço do Morango = " + precoTotalMorango);
		System.out.println("Preço da Maça = " + precoTotalMaca);

		double precoParcial = precoKgMorango + precoKgMaca;
		double precoTotal = precoParcial;

		if ((quantMorango + quantMaca) > 8 || precoParcial > 25) {
			precoTotal = precoParcial - ((precoParcial / 100) * 10);

		}

		System.out.println("Preço Total = " + precoTotal);

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
