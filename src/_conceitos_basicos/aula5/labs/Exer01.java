package _conceitos_basicos.aula5.labs;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean valor = false;
	
		int num = 0;
		while (!valor) {

			System.out.println("Entre com uma Nota: ");
			num = scan.nextInt();

			if (num <= 10 && num >= 0) {

				valor = true;
				System.out.println("Voc� digitou: " + num);
			} else {

				System.out.println("Nota Invalida digite novamente! ");
			}
		}

	}

}
