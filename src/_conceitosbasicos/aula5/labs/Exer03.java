package _conceitosbasicos.aula5.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {

		cleanScreen();
		Scanner scan = new Scanner(System.in);

		boolean verdadeiro = false;
		String nome;

		System.out.println("\nInforme o seu Nome: ");
		nome = scan.next();

		while (!verdadeiro) {

			if (nome.length() >= 3) {
				verdadeiro = true;
				System.out.println("Nome inserido com sucesso!");
			} else {
				System.out.println("Nome precisa no mínimo 3 caractere!\n");
				System.out.println("Informe o seu Nome: ");
				nome = scan.next();
			}

		}

		verdadeiro = false;
		int idade;

		System.out.println("Informe a sua idade: ");
		idade = scan.nextInt();

		while (!verdadeiro) {

			if (idade >= 0 && idade <= 150) {
				verdadeiro = true;
				System.out.println("Idade inserida com sucesso!");

			} else {
				System.out.println("Idade invalida!\n");
				System.out.println("Informe a sua idade: ");
				idade = scan.nextInt();
			}
		}

		verdadeiro = false;
		int salario;

		System.out.println("Informe o salário: ");
		salario = scan.nextInt();

		while (!verdadeiro) {

			if (salario > 0) {
				verdadeiro = true;
				System.out.println("Salário inserido com sucesso!");

			} else {
				System.out.println("Salário invalido!\n");
				System.out.println("Informe o salário: ");
				idade = scan.nextInt();
			}
		}

		verdadeiro = false;
		String sexo;

		System.out.println("Informe o seu Sexo: ");
		sexo = scan.next();

		while (!verdadeiro) {

			if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				verdadeiro = true;
				System.out.println("Sexo inserido com sucesso!");
			} else {
				System.out.println("Sexo invalido!\n");
				System.out.println("Informe o seu Sexo: ");
				sexo = scan.next();

			}
		}

		verdadeiro = false;
		String estadoCivil;

		System.out.println("Informe o Estado Civil: ");
		estadoCivil = scan.next();

		while (!verdadeiro) {

			if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c")
					|| estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")) {
				verdadeiro = true;
				System.out.println("Estado Civil inserido com sucesso!");

			} else {
				System.out.println("Estado Civil invalido!\n");
				System.out.println("Informe o Estado Civil: ");
				estadoCivil = scan.next();
			}
		}
		System.out.println("As seguintes informações foram coletadas:");

		System.out.println("Nome: " + nome);
		System.out.println("idade: " + idade);
		System.out.println("Salário: " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado Civil: " + estadoCivil);

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
