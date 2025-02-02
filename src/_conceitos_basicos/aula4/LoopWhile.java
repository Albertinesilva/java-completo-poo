package _conceitos_basicos.aula4;

public class LoopWhile {

	public static void main(String[] args) {
		int i = 10;

		while (i != 0) {

			System.out.println("Contando at� " + i);
			--i;
		}

		System.out.println(i);// valor de i

		do {

			i++;
			System.out.println("valor de i:" + i);
			
		} while (i < 15);
		
		System.out.println(i);

	}

}
