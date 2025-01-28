package expressoes_lambda.stream.Operacoes_intermediarias;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediaryOperationsExamples {
  public static void main(String[] args) {

    limparTela();

    // Lista de números para os exemplos
    List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 5, 6, 7, 8, 9, 10);

    // 1. filter(): Filtra apenas os números pares
    List<Integer> evenNumbers = numbers.stream()
        .filter(n -> n % 2 == 0)
        .collect(Collectors.toList());
    System.out.println("Números pares: " + evenNumbers);

    // 2. map(): Multiplica cada número por 2
    List<Integer> doubledNumbers = numbers.stream()
        .map(n -> n * 2)
        .collect(Collectors.toList());
    System.out.println("Números multiplicados por 2: " + doubledNumbers);

    // 3. flatMap(): Achata listas dentro de uma lista
    List<List<String>> nestedList = Arrays.asList(
        Arrays.asList("A", "B"),
        Arrays.asList("C", "D"),
        Arrays.asList("E", "F"));
    List<String> flatList = nestedList.stream()
        .flatMap(List::stream)
        .collect(Collectors.toList());
    System.out.println("Lista achatada: " + flatList);

    // 4. peek(): Mostra os valores antes e depois da transformação
    numbers.stream()
        .peek(n -> System.out.println("Antes do map: " + n))
        .map(n -> n * 2)
        .peek(n -> System.out.println("Depois do map: " + n))
        .collect(Collectors.toList());

    // 5. distinct(): Remove valores duplicados
    List<Integer> uniqueNumbers = numbers.stream()
        .distinct()
        .collect(Collectors.toList());
    System.out.println("Números únicos: " + uniqueNumbers);

    // 6. sorted(): Ordena os elementos
    List<String> names = Arrays.asList("Carlos", "Ana", "Beatriz");
    List<String> sortedNames = names.stream()
        .sorted()
        .collect(Collectors.toList());
    System.out.println("Nomes ordenados: " + sortedNames);

    // 7. skip(): Pula os primeiros 3 elementos
    List<Integer> skippedNumbers = numbers.stream()
        .skip(3)
        .collect(Collectors.toList());
    System.out.println("Lista após pular 3 elementos: " + skippedNumbers);

    // 8. limit(): Pega apenas os primeiros 5 elementos
    List<Integer> limitedNumbers = numbers.stream()
        .limit(5)
        .collect(Collectors.toList());
    System.out.println("Lista limitada a 5 elementos: " + limitedNumbers);
  }

  public static void limparTela() {
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
