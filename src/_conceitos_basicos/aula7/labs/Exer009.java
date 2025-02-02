package _conceitos_basicos.aula7.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer009 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		double[] vetorC = new double[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Informe um n�mero: ");
			vetorA[i] = scan.nextInt();

		}

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Informe um n�mero: ");
			vetorB[i] = scan.nextInt();
			vetorC[i] = vetorA[i] / vetorB[i];

		}

		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {

			System.out.print(vetorA[i] + " ");
		}

		System.out.println();
		System.out.print("Vetor B = ");
		for (int i = 0; i < vetorA.length; i++) {

			System.out.print(vetorB[i] + " ");
		}

		DecimalFormat df = new DecimalFormat("###,###.##");
		System.out.println();
		System.out.print("Vetor C = ");
		for (int i = 0; i < vetorA.length; i++) {

			System.out.print(vetorC[i] + " ");
		}

	}

}
