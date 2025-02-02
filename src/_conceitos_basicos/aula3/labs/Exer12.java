package _conceitos_basicos.aula3.labs;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o valor Hora: ");
		double valorHora = scan.nextDouble();

		System.out.println("Entre com as horas trabalhadas no m�s: ");
		double qtdHoras = scan.nextDouble();

		double salarioBruto = valorHora * qtdHoras;

		int percentualIr = 0;
		if (salarioBruto <= 900) {
			 percentualIr = 0;

		} else {

			if (salarioBruto > 900 && salarioBruto <= 1500) {
				percentualIr = 5;
			} else {
				
				if(salarioBruto > 1500 && salarioBruto <= 2500) {
					percentualIr = 10;
				}else {
					
				    percentualIr = 20;
				}
			}
		}
		
		double ir = (salarioBruto / 100) * percentualIr;
		double inss = (salarioBruto * 10)/100;
		double fgts = (salarioBruto / 100) * 11;
		double totalDescontos = ir + inss;
		double salarioLiquido =  salarioBruto - totalDescontos;
		
		System.out.println("Sal�rio Bruto: ("+ valorHora + " * " + qtdHoras +"): " +salarioBruto);
		System.out.println("(-) IR ("+ percentualIr + "%):" + ir);
		System.out.println("(-) INSS (10%):" +inss);
		System.out.println("FGTS (11%): " +fgts);
		System.out.println("Total de descontos: " + totalDescontos);
		System.out.println("Salario liquido: " + salarioLiquido);
		

	} 

}
