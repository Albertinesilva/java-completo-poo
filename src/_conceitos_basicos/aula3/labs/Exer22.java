package _conceitos_basicos.aula3.labs;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade (kg) de morango: ");
		int quantMorango = scan.nextInt();
		
		System.out.println("Entre com a quantidade (kg) de Ma�a: ");
		int quantMaca = scan.nextInt();
		
		double precoKgMorango = 0;
		if(quantMorango <= 5) {
			precoKgMorango = 2.5;
			
		}else {
			precoKgMorango = 2.2;
		}
		
		double precoKgMaca = 0;
		
		if(quantMaca <= 5) {
			precoKgMaca = 1.8;
			
		}else {
			precoKgMaca = 1.5;
		}
		
		double precoTotalMorango = quantMorango * precoKgMorango; 
		double precoTotalMaca = quantMaca * precoKgMaca; 
		
		double precoParcial = precoKgMorango + precoKgMaca;
		double precoTotal = precoParcial;
		
		if((quantMorango + quantMaca) > 8 || precoParcial > 25) {
			precoTotal = precoParcial - ((precoParcial / 100) * 10);
			
		}
		
		System.out.println("Pre�o Total = " +precoTotal);

	}

}
