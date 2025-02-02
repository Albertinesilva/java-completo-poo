package _conceitos_basicos.aula5.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {

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
				System.out.println("Informa��es Invalidas, informe novamente! ");

				System.out.println("Informe o seu nome: ");
				nome = scan.next();

				System.out.println("Informe a sua senha: ");
				senha = scan.nextInt();

			}

		}
	}

}
