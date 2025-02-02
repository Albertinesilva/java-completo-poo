package _conceitos_basicos.aula3.labs;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Telefonou para a vitima? ");
		String resposta1 = scan.next();

		System.out.println("Esteve no local do crime? ");
		String resposta2 = scan.next();

		System.out.println("Mora perto da vitima? ");
		String resposta3 = scan.next();

		System.out.println("Devia para a vitima? ");
		String resposta4 = scan.next();

		System.out.println("J� trabalhou com a vitima? ");
		String resposta5 = scan.next();

		int participacao = 0;

		if (resposta1.equalsIgnoreCase("Sim")) {
			participacao++;

		}
		if (resposta2.equalsIgnoreCase("Sim")) {
			participacao++;

		}

		if (resposta3.equalsIgnoreCase("Sim")) {
			participacao++;

		}

		if (resposta4.equalsIgnoreCase("Sim")) {
			participacao++;

		}

		if (resposta5.equalsIgnoreCase("Sim")) {
			participacao++;

		}

		if (participacao == 0) {

			System.out.println("Inocente!");

		} else {
			if (participacao == 2) {

				System.out.println("Suspeita!");

			} else {

				if (participacao == 3 || participacao == 4) {

					System.out.println("C�mplice!");

				} else {

					if (participacao == 5) {

						System.out.println("Assassino!");
					}
				}
			}
		}

	}

}
