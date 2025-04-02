package _conceitosbasicos.aula6;

import java.util.Scanner;

public class BreakEContinue {

	public static void main(String[] args) {

		cleanScreen();
		Scanner scan = new Scanner(System.in);

		/*
		 * System.out.println("Entre com um número: ");
		 * int num = scan.nextInt();
		 * 
		 * System.out.println("Entre com um limite: ");
		 * int limiteMax = scan.nextInt();
		 * 
		 * for(int i = num; i < limiteMax; i++) {
		 * 
		 * if(i % 7 == 0) {
		 * 
		 * System.out.println("O valor de i é: " + i);
		 * break;
		 * }
		 * }
		 */

		System.out.println("Entre com um número: ");
		int num = scan.nextInt();

		System.out.println("Entre com um limite: ");
		int limiteMax = scan.nextInt();

		for (int i = num; i <= limiteMax; i++) {

			if (i % 7 == 0) {
				continue;
			}
			System.out.println("O valor de i é: " + i);
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
