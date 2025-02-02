package _conceitos_basicos.aula2;

public class OperadoresRelacionais {

	public static void main(String[] args) {

		cleanScreen();
		
		int valor1 = 1;
		int valor2 = 2;
		
		System.out.println("Valor1 == Valor2: " + (valor1 == valor2));
		System.out.println("Valor1 != Valor2: " + (valor1 != valor2));
		System.out.println("Valor1 > Valor2: " + (valor1 > valor2));
		System.out.println("Valor1 >= Valor2: " + (valor1 >= valor2));
		System.out.println("Valor1 < Valor2: " + (valor1 < valor2));
		System.out.println("Valor1 <= Valor2: " + (valor1 <= valor2));

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
