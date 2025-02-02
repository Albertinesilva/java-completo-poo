package _conceitos_basicos.aula5.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {

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
				System.out.println("Nome precisa no m�nimo 3 caractere!\n");
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

		System.out.println("Informe o sal�rio: ");
		salario = scan.nextInt();

		while (!verdadeiro) {

			if (salario > 0) {
				verdadeiro = true;
				System.out.println("Sal�rio inserido com sucesso!");

			} else {
				System.out.println("Sal�rio invalido!\n");
				System.out.println("Informe o sal�rio: ");
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
		System.out.println("As seguintes informa��es foram coletadas:");
		
		System.out.println("Nome: " + nome);
		System.out.println("idade: " + idade);
		System.out.println("Sal�rio: " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado Civil: " + estadoCivil);
	}
}
