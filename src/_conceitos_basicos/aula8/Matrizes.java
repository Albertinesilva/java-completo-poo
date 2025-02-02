package _conceitos_basicos.aula8;

import java.util.Random;

public class Matrizes {

	public static void main(String[] args) {
		
		double[][] notasAlunos = new double[4][4];
		Random gerador = new Random();
		
		for(int l = 0; l < 4; l++) {
			
			for(int c = 0; c < 4; c++) {
				notasAlunos[l][c] = gerador.nextInt(10);
				System.out.print("|" + notasAlunos[l][c] + "|");
			}
			System.out.print("\n");
		}
	}

}
