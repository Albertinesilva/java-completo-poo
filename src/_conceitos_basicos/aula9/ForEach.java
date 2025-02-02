package _conceitos_basicos.aula9;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {

		int[] notas = new int[10];
		Random random = new Random();

		for (int i = 0; i < notas.length; i++) {

			notas[i] = random.nextInt(10);
		}

		for (int i = 0; i < notas.length; i++) {

			System.out.println("Noras: " + notas[i]);
		}

		System.out.println("\nUsando o For Each");
		for (int nota : notas) {

			System.out.println("Noras: " + nota);
		}

	}

}
