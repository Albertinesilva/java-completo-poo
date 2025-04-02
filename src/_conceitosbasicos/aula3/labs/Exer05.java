package _conceitosbasicos.aula3.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {

		cleanScreen();
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a 1º nota: ");
		double nota1 = scan.nextDouble();

		System.out.println("Digite a 2º nota: ");
		double nota2 = scan.nextDouble();

		double media = (nota1 + nota2) / 2;

		if (media == 10) {
			System.out.println("Aluno Aprovado com Distinção!");

		} else {

			if (media < 7) {
				System.out.println("Aluno Reprovado!");
			} else {

				System.out.println("Aluno Aprovado!");

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
