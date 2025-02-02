package _conceitos_basicos.aula3.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o 1� Pre�o: ");
		double preco1 = scan.nextDouble();

		System.out.println("Informe o 2� Pre�o: ");
		double preco2 = scan.nextDouble();

		System.out.println("Informe o 3� Pre�o: ");
		double preco3 = scan.nextDouble();

		if (preco1 <= preco2 && preco1 <= preco3) {
			System.out.println("Compre o Produto (" + preco1 + ") 1�!");
		} else {
			if (preco2 <= preco1 && preco2 <= preco3) {
				System.out.println("Compre o Produto (" + preco2 + ") 2�!");

			} else {
				if (preco3 <= preco1 && preco3 <= preco2) {
					System.out.println("Compre o Produto (" + preco3 + ") 3�!");
				}
			}
		}
	}

}
