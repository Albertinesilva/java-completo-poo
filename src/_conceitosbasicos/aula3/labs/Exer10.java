package _conceitosbasicos.aula3.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {

		cleanScreen();
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o turno que Você estuda: ");
		String turno = scan.next();

		switch (turno) {

			case "M":
			case "m":
				System.out.println("Bom dia!");
				break;

			case "v":
			case "V":
				System.out.println("Boa tarde!");
				break;

			case "n":
			case "N":
				System.out.println("Boa noite!");
				break;

			default:
				System.out.println("Valor Invalido!");
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
