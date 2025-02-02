package _conceitos_basicos.aula3.labs;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o 1� n�mero: ");
		double num1 = scan.nextDouble();

		System.out.println("Digite o 2� n�mero: ");
		double num2 = scan.nextDouble();

		System.out.println("Escolha a op��o:\n1 - [+]\n2 - [-]\n3 - [*]\n4 - [/]");
		int opcao = scan.nextInt();

		double resultado = 0;
		boolean valida = true;
		switch (opcao) {

		case 1:
			resultado = num1 + num2;
			System.out.println("Resultado da Soma: " + resultado);
			break;

		case 2:
			resultado = num1 - num2;
			System.out.println("Resultado da Subtra��o " + resultado);
			break;

		case 3:
			resultado = num1 * num2;
			System.out.println("Resultado da Multiplica��o " + resultado);
			break;

		case 4:
			resultado = num1 / num2;
			System.out.println("Resultado da Divis�o " + resultado);
			break;

		default:
			System.out.println("Op�a� invalida!");
			valida = false;
		}

		if (valida) {
             
			if (resultado > 0) {
				System.out.println("Resultado: possitivo");
			} else {
				System.out.println("Resultado: negativo");
			}

			if (resultado % 2 == 0) {
				System.out.println("� Par");

			} else {
				System.out.println("� Impar");
			}
		}

	}

}
