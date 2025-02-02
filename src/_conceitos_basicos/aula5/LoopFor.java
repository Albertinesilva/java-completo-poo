package _conceitos_basicos.aula5;

public class LoopFor {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			System.out.println("i tem valor: " + i);

		}

		for (int i = 5; i >= 0; i--) {
			System.out.println("i tem valor: " + i);

		}

		int soma = 0;
		for (int i = 1; i < 5; soma += i++) {
			
			System.out.println("Valor da soma = " + soma);

		}
	}

}
