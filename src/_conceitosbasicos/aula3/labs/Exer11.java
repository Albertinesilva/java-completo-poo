package _conceitosbasicos.aula3.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {

		cleanScreen();
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o seu salário: ");
		double salario = scan.nextDouble();
		double aumento = 0;
		double percentual = 0;

		if (salario <= 280) {
			percentual = 20;

		} else {
			if (salario > 280 && salario <= 700) {
				percentual = 15;

			} else {
				if (salario > 700 && salario <= 1500) {
					percentual = 10;

				} else {
					if (salario >= 1500) {
						percentual = 5;

					}
				}
			}
		}
		aumento = (salario / 100) * percentual;

		System.out.println("Salario: " + salario);
		System.out.println("Percentual: " + percentual);
		System.out.println("Aumento: " + aumento);
		aumento = salario + aumento;
		System.out.println("Salário apos o aumento: " + aumento);

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
