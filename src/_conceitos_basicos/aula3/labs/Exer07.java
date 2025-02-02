package _conceitos_basicos.aula3.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o 1� n�mero: ");
		double num1 = scan.nextDouble();

		System.out.println("Informe o 2� n�mero: ");
		double num2 = scan.nextDouble();

		System.out.println("Informe o 3� n�mero: ");
		double num3 = scan.nextDouble();

		if (num1 >= num2 && num1 >= num3) {
			System.out.println("O n�mero " + num1 + " � Maior!");
		} else {
			if (num2 >= num1 && num2 >= num3) {
				System.out.println("O n�mero " + num2 + " � Maior!");

			} else {
				if (num3 >= num1 && num3 >= num2) {
					System.out.println("O n�mero " + num3 + " � Maior!");
				}
			}
		}

		if (num1 <= num2 && num1 <= num3) {
			System.out.println("O n�mero " + num1 + " � Menor!");
		} else {
			if (num2 <= num1 && num2 <= num3) {
				System.out.println("O n�mero " + num2 + " � Menor!");

			} else {
				if (num3 <= num1 && num3 <= num2) {
					System.out.println("O n�mero " + num3 + " � Menor!");
				}
			}
		}

	}

}
