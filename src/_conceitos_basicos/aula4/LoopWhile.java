package _conceitos_basicos.aula4;

public class LoopWhile {

	public static void main(String[] args) {

		cleanScreen();

		int i = 10;
		while (i != 0) {

			System.out.println("Contando até " + i);
			--i;
		}

		System.out.println(i);// valor de i

		do {

			i++;
			System.out.println("valor de i:" + i);

		} while (i < 15);

		System.out.println(i);

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
