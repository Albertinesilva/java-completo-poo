package expressoes_lambda.pipeline.application;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

  public static void main(String[] args) {

    cleanScreen();
    Locale.setDefault(Locale.US);

    // Cria uma lista de inteiros usando Arrays.asList().
    List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

    // Cria uma Stream a partir da lista e multiplica cada elemento por 10.
    Stream<Integer> st1 = list.stream().map(x -> x * 10);

    // Converte a Stream para um array e imprime os valores transformados.
    System.out.println(Arrays.toString(st1.toArray()));

    // Usa o método reduce() para somar todos os elementos da lista.
    // O valor inicial é 0, e a função (x, y) -> x + y soma os elementos sequencialmente.
    int sum = list.stream().reduce(0, (x, y) -> x + y);

    // Imprime a soma dos elementos da lista.
    System.out.println("Sum = " + sum);

    // Cria uma nova lista contendo apenas os números pares da lista original,
    // multiplica cada número par por 10 e coleta os resultados em uma nova lista.
    List<Integer> newList = list.stream()
        .filter(x -> x % 2 == 0) // Filtra apenas os números pares (4 e 10)
        .map(x -> x * 10) // Multiplica os números filtrados por 10 (40 e 100)
        .collect(Collectors.toList()); // Coleta os valores transformados em uma nova lista

    // Converte a nova lista para um array e imprime os valores.
    System.out.println(Arrays.toString(newList.toArray()));

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
