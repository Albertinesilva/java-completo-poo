package _conceitos_basicos.aula5.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double popA = 0;
		double popB = 0;
		double taxaA = 0;
		double taxaB = 0;
		boolean valido = false;

		while (!valido) {

			System.out.println("Entre com a popula��o A: ");
			popA = scan.nextDouble();

			if (popA > 0) {
				valido = true;

			} else {
				System.out.println("Popula��o A precisa ser maior que 0!");
			}

		}

		valido = false;
		while (!valido) {

			System.out.println("Entre com a popula��o B: ");
			popB = scan.nextDouble();

			if (popB > 0) {
				valido = true;

			} else {
				System.out.println("Popula��o B precisa ser maior que 0!");
			}

		}

		valido = false;
		while (!valido) {

			System.out.println("Entre com a taxa de crescimento da popula��o A: ");
			taxaA = scan.nextDouble();

			if (taxaA > 0) {
				valido = true;

			} else {
				System.out.println("Taxa de crescimento A precisa ser maior que 0!");
			}

		}

		valido = false;
		while (!valido) {

			System.out.println("Entre com a taxa de crescimento da popula��o B: ");
			taxaB = scan.nextDouble();

			if (taxaB > 0) {
				valido = true;

			} else {
				System.out.println("Taxa de crescimento B precisa ser maior que 0!");
			}

		}

		int cont = 0;
		while (popA < popB) {

			popA += (popA / 100) * taxaA;
			popB += (popB / 100) * taxaB;
			cont++;
		}

		System.out.println("\nPopula��o A: " + popA);
		System.out.println("Popula��o B: " + popB);
		System.out.println("Quantidade de anos: " + cont);

	}

}
