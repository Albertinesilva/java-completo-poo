package _conceitos_basicos.aula3.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {

		cleanScreen();
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o dia da semana (1 - 7): ");

		int diaSemana = scan.nextInt();

		switch (diaSemana) {

			case 1:
				System.out.println("Domingo!");
				break;

			case 2:
				System.out.println("Segunda feira!");
				break;
			case 3:
				System.out.println("Terça feira!");
				break;
			case 4:
				System.out.println("Quarta feira!");
				break;
			case 5:
				System.out.println("Quinta feira!");
				break;
			case 6:
				System.out.println("Sexta feira!");
				break;
			case 7:
				System.out.println("Sabado feira!");
				break;

			default:
				System.out.println("Não � um dia da semana válido!...");
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
