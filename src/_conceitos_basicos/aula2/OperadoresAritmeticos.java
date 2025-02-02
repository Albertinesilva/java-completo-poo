package _conceitos_basicos.aula2;

public class OperadoresAritmeticos {

	public static void main(String[] args) {

		cleanScreen();

		int resultado = 1 + 2;
		System.out.println(resultado);

		resultado = resultado - 1;
		System.out.println(resultado);

		resultado = resultado * 2;
		System.out.println(resultado);

		resultado = resultado / 2;
		System.out.println(resultado);

		resultado = resultado + 8;
		System.out.println(resultado);

		resultado = resultado % 7;
		System.out.println(resultado);

		String primeiroNome = "Esta é";
		String segundoNome = " uma String concatenada.";
		String terceiroNome = primeiroNome + segundoNome;
		System.out.println(terceiroNome);

		resultado++;
		System.out.println(resultado);

		// Primeiro imprime o resultado que é 4. Na próxima linha imprime o número 5
		System.out.println(resultado++);
		System.out.println(resultado);

		// mesma coisa que
		// System.out.println(resultado);
		// resultado = resultado + 1;
		// resultado +=1;

		// adiciona o valor na string depois imprime o resultado = 6
		System.out.println(++resultado);

		// mesma coisa que
		// resultado +=1;
		// System.out.println(resultado);

		resultado--;
		System.out.println(resultado);

		// Primeiro imprimir e depois retirar 1.
		System.out.println(resultado--);
		System.out.println(resultado);

		// primeiro vai retirar 1 e depois vai imprimir.
		System.out.println(--resultado);

	}

	public static void cleanScreen() {
		try {
			final String os = System.getProperty("os.name");

			if (os.contains("Windows")) {
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			} else {
				System.out.print("\033[H\033[2J");
				System.out.flush();
			}
		} catch (final Exception e) {
			// Trata exceções (pode ser uma exceção de interrupção)
			e.printStackTrace();
		}
	}

}
