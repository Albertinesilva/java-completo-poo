package _conceitos_basicos.aula3.labs;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o 1� n�mero: ");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com o 2� n�mero: ");
		int num2 = scan.nextInt();
		
		if(num1 > num2) {
			System.out.println("O 1� N�mero � Maior " + num1);
		}
		else
		{
			System.out.println("O 2� N�mero � Maior " + num2);
		}
	}

}
