package _conceitos_basicos.aula3.labs;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {

		cleanScreen();
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o lado 1");
		int lado1 = scan.nextInt();

		System.out.println("Entre com o lado 2");
		int lado2 = scan.nextInt();

		System.out.println("Entre com o lado 3");
		int lado3 = scan.nextInt();

		if (((lado1 + lado2) > lado3) || ((lado1 + lado3) > lado2) || ((lado2 + lado3) > lado1)) {

			if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
				System.out.println("Triângulo Equilatero");

			} else {
				if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
					System.out.println("Triângulo Escaleno");

				} else {
					if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
						System.out.println("Triangulo Isoceles");

					}
				}
			}

		} else {
			System.out.println("Não forma um triângulo");
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
