package _conceitos_basicos.aula3.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a 1� nota: ");
		double nota1 = scan.nextDouble();

		System.out.println("Digite a 2� nota: ");
		double nota2 = scan.nextDouble();

		double media = (nota1 + nota2) / 2;

		if (media == 10) {
			System.out.println("Aluno Aprovado com Distin��o!");

		} else {

			if (media < 7) {
				System.out.println("Aluno Reprovado!");
			} else {

				System.out.println("Aluno Aprovado!");

			}

		}
	}
}
