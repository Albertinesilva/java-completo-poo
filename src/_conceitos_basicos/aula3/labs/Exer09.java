package _conceitos_basicos.aula3.labs;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o 1� n�mero: ");
		double num1 = scan.nextDouble();

		System.out.println("Informe o 2� n�mero: ");
		double num2 = scan.nextDouble();

		System.out.println("Informe o 3� n�mero: ");
		double num3 = scan.nextDouble();

		if (num1 <= num2 && num1 <= num3 && num2 <= num3) {

			// num1 � menor
			// num3 � maior
			// num1 < num2 < num3
			System.out.println(num3 + " - " + num2 + " - " + num1);
		} else {
			if (num1 <= num2 && num1 <= num3 && num3 <= num2) {

				// num1 � menor
				// num2 � maior
				// num1 < num3 < num2
				System.out.println(num2 + " - " + num3 + " - " + num1);
			}
		}

		if (num2 <= num1 && num2 <= num3 && num1 <= num3) {

			// num2 � menor
			// num3 � maior
			// num2 < num1 < num3
			System.out.println(num3 + " - " + num2 + " - " + num1);
		} else {
			if (num2 <= num1 && num2 <= num3 && num3 <= num1) {

				// num2 � menor
				// num1 � maior
				// num2 < num3 < num1
				System.out.println(num1 + " - " + num3 + " - " + num2);
			}
		}

		if (num3 <= num1 && num3 <= num2 && num1 <= num2) {

			// num3 � menor
			// num2 � maior
			// num3 < num1 < num2
			System.out.println(num2 + " - " + num1 + " - " + num3);
		} else {
			if (num3 <= num1 && num3 <= num2 && num2 <= num1) {

				// num3 � menor
				// num1 � maior
				// num3 < num2 < num1
				System.out.println(num1 + " - " + num2 + " - " + num3);
			}
		}

	}

}
