package _conceitos_basicos.aula5.labs;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {

		cleanScreen();
		Scanner scan = new Scanner(System.in);

		boolean valor = false;
		int num = 0;

		while (!valor) {

			System.out.println("Entre com uma Nota: ");
			num = scan.nextInt();

			if (num <= 10 && num >= 0) {

				valor = true;
				System.out.println("Você digitou: " + num);
			} else {

				System.out.println("Nota Invalida digite novamente! ");
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
