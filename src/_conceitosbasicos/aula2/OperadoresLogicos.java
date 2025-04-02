package _conceitosbasicos.aula2;

public class OperadoresLogicos {

	public static void main(String[] args) {

		cleanScreen();

		int valor1 = 1;
		int valor2 = 2;

		boolean resultado1 = (valor1 == 1) && (valor2 == 2);
		System.out.println("Valor1 é 1 AND valor2 é 2 - resultado: " + resultado1);

		boolean resultado2 = (valor1 == 1) || (valor2 == 2);
		System.out.println("Valor1 é 1 AND valor2 é 2 - resultado: " + resultado2);

		boolean verdadeiro = true;
		boolean falso = false;
		System.out.println(verdadeiro && falso);
		System.out.println(verdadeiro || falso);
		System.out.println(verdadeiro ^ falso);
		System.out.println(!verdadeiro && falso);

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
