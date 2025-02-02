package expressoes_lambda.stream.application;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class Program {

  public static void main(String[] args) {

    cleanScreen();
    Locale.setDefault(Locale.US);

    List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

    // Cria uma Stream de inteiros a partir da lista original.
    Stream<Integer> st1 = list.stream();

    // Converte a Stream para um array e imprime os elementos da lista original.
    System.out.println(Arrays.toString(st1.toArray()));

    // Cria uma nova Stream a partir da lista original, multiplicando cada elemento por 10.
    Stream<Integer> st2 = list.stream().map(x -> x * 10);

    // Converte a Stream resultante para um array e imprime os valores transformados.
    System.err.println(Arrays.toString(st2.toArray()));

    // Cria uma Stream de strings com valores fixos: "Maria", "Alex" e "Bob".
    Stream<String> st3 = Stream.of("Maria", "Alex", "Bob");

    // Converte a Stream de strings para um array e imprime os valores.
    System.out.println(Arrays.toString(st3.toArray()));

    // Cria uma Stream infinita de inteiros iniciando em 0 e incrementando de 2 em 2.
    Stream<Integer> st4 = Stream.iterate(0, x -> x + 2);

    // Limita a Stream infinita aos 10 primeiros valores, converte para array e imprime.
    System.out.println(Arrays.toString(st4.limit(10).toArray()));

    // Cria uma Stream infinita que gera pares de números baseados na sequência de Fibonacci.
    // Cada elemento da Stream é um array Long[] com dois números consecutivos da sequência.
    Stream<Long> st5 = Stream.iterate(new Long[] { 0L, 1L }, p -> new Long[] { p[1], p[0] + p[1] })
    .map(p -> p[0]); // Mapeia cada par para o primeiro número do par (Fibonacci atual).

    // Limita a Stream de Fibonacci aos 10 primeiros números, converte para array e imprime.
    System.out.println(Arrays.toString(st5.limit(10).toArray()));

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
