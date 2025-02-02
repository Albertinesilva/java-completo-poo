package _conceitos_basicos.aula3.labs;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {

		cleanScreen();
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o 1º número: ");
		double num1 = scan.nextDouble();

		System.out.println("Digite o 2º número: ");
		double num2 = scan.nextDouble();

		System.out.println("Escolha a opção:\n1 - [+]\n2 - [-]\n3 - [*]\n4 - [/]");
		int opcao = scan.nextInt();

		double resultado = 0;
		boolean valida = true;
		switch (opcao) {

			case 1:
				resultado = num1 + num2;
				System.out.println("Resultado da Soma: " + resultado);
				break;

			case 2:
				resultado = num1 - num2;
				System.out.println("Resultado da Subtra��o " + resultado);
				break;

			case 3:
				resultado = num1 * num2;
				System.out.println("Resultado da Multiplicação " + resultado);
				break;

			case 4:
				resultado = num1 / num2;
				System.out.println("Resultado da Divisão " + resultado);
				break;

			default:
				System.out.println("Opação invalida!");
				valida = false;
		}

		if (valida) {

			if (resultado > 0) {
				System.out.println("Resultado: possitivo");
			} else {
				System.out.println("Resultado: negativo");
			}

			if (resultado % 2 == 0) {
				System.out.println("É Par");

			} else {
				System.out.println("É Impar");
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
