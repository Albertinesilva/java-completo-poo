package _conceitosbasicos.aula5.labs;

public class Exer04 {

	public static void main(String[] args) {

		cleanScreen();

		int popA = 80000;
		int popB = 200000;
		int cont = 0;

		while (popA < popB) {

			popA += (popA / 100) * 3;
			popB += (popB / 100) * 1.5;
			cont++;
		}

		System.out.println("População A: " + popA);
		System.out.println("População B: " + popB);
		System.out.println("Quantidade de Anos: " + cont);

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
