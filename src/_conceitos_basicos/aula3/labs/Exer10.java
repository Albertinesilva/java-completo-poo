package _conceitos_basicos.aula3.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o turno que Voc� estuda: ");
		String turno = scan.next();

		switch (turno) {

		case "M":
		case "m":
			System.out.println("Bom dia!");
			break;

		case "v":
		case "V":
			System.out.println("Boa tarde!");
			break;

		case "n":
		case "N":
			System.out.println("Boa noite!");
			break;

		default:
			System.out.println("Valor Invalido!");
		}
	}

}
