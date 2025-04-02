package _conceitosbasicos.aula3.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {

		cleanScreen();
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o 1º Preço: ");
		double preco1 = scan.nextDouble();

		System.out.println("Informe o 2º Preço: ");
		double preco2 = scan.nextDouble();

		System.out.println("Informe o 3º Preço: ");
		double preco3 = scan.nextDouble();

		if (preco1 <= preco2 && preco1 <= preco3) {
			System.out.println("Compre o Produto (" + preco1 + ") 1º!");
		} else {
			if (preco2 <= preco1 && preco2 <= preco3) {
				System.out.println("Compre o Produto (" + preco2 + ") 2º!");

			} else {
				if (preco3 <= preco1 && preco3 <= preco2) {
					System.out.println("Compre o Produto (" + preco3 + ") 3º!");
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
