package _conceitos_basicos.aula3.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe uma vogal! ");
		String letra = scan.next();

		if (letra.length() > 1) {
			System.out.println("Tem mais de uma letra!");
		} else {

			if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("b") || letra.equalsIgnoreCase("c")
					|| letra.equalsIgnoreCase("d") || letra.equalsIgnoreCase("e")) {

				System.out.println("A letra " + letra + " � uma vogal!");
			} else {
				System.out.println("A letra " + letra + " n�o � uma vogal!");
			}
		}
	}

}
