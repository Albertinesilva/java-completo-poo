package _conceitos_basicos.aula3.labs;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {

		cleanScreen();
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe a quantidade de litros vendidos: ");
		double litros = scan.nextDouble();

		System.out.println("Entre com o tipo de combustível: ");
		String tipo = scan.next();

		double precoAlcool = 1.9;
		double precoGasolina = 2.5;
		int percDesconto = 0;
		double total = 0;
		double totalDesc = 0;

		if (tipo.equalsIgnoreCase("a")) {

			if (litros <= 20) {
				percDesconto = 3;
			} else {
				percDesconto = 5;
			}

			total = litros * precoAlcool;

		} else {
			if (tipo.equalsIgnoreCase("g")) {

				if (litros <= 20) {
					percDesconto = 4;
				} else {
					percDesconto = 6;
				}

				total = litros * precoGasolina;
			}
		}

		totalDesc = (total / 100) * percDesconto;

		double precoApagar = total - totalDesc;
		System.out.println("Valor a ser pago: " + precoApagar);

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
