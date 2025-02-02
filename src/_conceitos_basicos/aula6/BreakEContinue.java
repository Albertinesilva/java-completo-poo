package _conceitos_basicos.aula6;

import java.util.Scanner;

public class BreakEContinue {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Entre com um n�mero: ");
		int num = scan.nextInt();
		
		System.out.println("Entre com um limite: ");
		int limiteMax = scan.nextInt();
		
		for(int i = num; i < limiteMax; i++) {
			
			if(i % 7 == 0) {
				
				System.out.println("O valor de i �: " + i);
				break;
			}
		}*/
		
		System.out.println("Entre com um n�mero: ");
		int num = scan.nextInt();
		
		System.out.println("Entre com um limite: ");
		int limiteMax = scan.nextInt();
		
		for(int i = num; i <= limiteMax; i++) {
			
			if(i % 7 == 0) {
				continue;
			}
			System.out.println("O valor de i �: " + i);
		}
		
	}

}
