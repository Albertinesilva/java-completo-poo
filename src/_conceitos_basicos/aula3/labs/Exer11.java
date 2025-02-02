package _conceitos_basicos.aula3.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o seu sal�rio: ");
		double salario = scan.nextDouble();
		double aumento = 0;
		double percentual = 0;

		if (salario <= 280) {
			percentual = 20;
			
		} else {
			if (salario > 280 && salario <= 700) {
				percentual = 15;
				
			} else {
				if (salario > 700 && salario <= 1500) {
					percentual = 10;
					
				} else {
					if (salario >= 1500) {
						percentual = 5;
						
					}
				}
			}
		}
		aumento = (salario / 100) * percentual;
		
		System.out.println("Salario: " +salario);
		System.out.println("Percentual: " +percentual);
		System.out.println("Aumento: " +aumento);
		aumento = salario + aumento;
		System.out.println("Sal�rio ap�s o aumento: " + aumento);

	}

}
