package _conceitos_basicos.aula5;

public class LoopFor {

	public static void main(String[] args) {

		cleanScreen();

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
