package _conceitos_basicos.aula3.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o 1� n�mero: ");
		int num = scan.nextInt();
		
		
		if(num < 0 ) {
			System.out.println("O n�mero " + num+ " � um n�mero negativo!");
		}
		else
		{
			System.out.println("O n�mero " + num + " � possitivo");
		}
		

	}

}
