package _conceitosbasicos.aula5.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {

		cleanScreen();
		Scanner scan = new Scanner(System.in);

		boolean valor = false;

		System.out.println("Informe o seu nome: ");
		String nome = scan.next();

		System.out.println("Informe a sua senha: ");
		int senha = scan.nextInt();

		while (!valor) {

			if (nome.equalsIgnoreCase("Albert") && senha == 100) {

				valor = true;
				System.out.println("Seu nome: " + nome);
				System.out.println("Senha: " + senha);

			} else {
				System.out.println("Informações Invalidas, informe novamente! ");

				System.out.println("Informe o seu nome: ");
				nome = scan.next();

				System.out.println("Informe a sua senha: ");
				senha = scan.nextInt();

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
