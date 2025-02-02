package expressoes_lambda.calculo_lambda.programacao_imperativa.application;

import java.util.Arrays;

public class Program {
  public static int globalValue = 3;

  public static void main(String[] args) {
    
    cleanScreen(); // limpa a tela do console
    
    int[] vect = new int[] { 3, 4, 5 };
    changeOddValues(vect); // Exemplo de função que não é referencialmente transparente
    System.out.println(Arrays.toString(vect));
  }

  public static void changeOddValues(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] % 2 != 0) {
        numbers[i] += globalValue;
      }
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
