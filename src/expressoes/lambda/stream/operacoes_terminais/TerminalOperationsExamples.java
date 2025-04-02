package expressoes.lambda.stream.operacoes_terminais;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperationsExamples {
  public static void main(String[] args) {

    cleanScreen();

    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    // 1. forEach(): Executa uma ação para cada elemento
    System.out.println("Usando forEach:");
    numbers.stream().forEach(n -> System.out.println("Número: " + n));

    // 2. forEachOrdered(): Garante a ordem do processamento
    System.out.println("\nUsando forEachOrdered:");
    numbers.stream().forEachOrdered(n -> System.out.println("Número ordenado: " + n));

    // 3. toArray(): Converte a Stream em um array
    Integer[] numberArray = numbers.stream().toArray(Integer[]::new);
    System.out.println("\nArray gerado: " + Arrays.toString(numberArray));

    // 4. reduce(): Reduz os elementos para um único valor (soma)
    int sum = numbers.stream().reduce(0, Integer::sum);
    System.out.println("\nSoma dos números: " + sum);

    // 5. collect(): Coleta os elementos em uma lista
    List<Integer> collectedList = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
    System.out.println("\nNúmeros pares coletados em uma lista: " + collectedList);

    // 6. min(): Encontra o menor valor
    Optional<Integer> min = numbers.stream().min(Integer::compareTo);
    min.ifPresent(value -> System.out.println("\nMenor valor: " + value));

    // 7. max(): Encontra o maior valor
    Optional<Integer> max = numbers.stream().max(Integer::compareTo);
    max.ifPresent(value -> System.out.println("Maior valor: " + value));

    // 8. count(): Conta o número de elementos
    long count = numbers.stream().count();
    System.out.println("\nTotal de números: " + count);

    // 9. anyMatch(): Verifica se algum elemento é maior que 8
    boolean anyMatch = numbers.stream().anyMatch(n -> n > 8);
    System.out.println("\nAlgum número maior que 8? " + anyMatch);

    // 10. allMatch(): Verifica se todos os elementos são menores que 15
    boolean allMatch = numbers.stream().allMatch(n -> n < 15);
    System.out.println("Todos os números são menores que 15? " + allMatch);

    // 11. noneMatch(): Verifica se nenhum número é negativo
    boolean noneMatch = numbers.stream().noneMatch(n -> n < 0);
    System.out.println("Nenhum número é negativo? " + noneMatch);

    // 12. findFirst(): Retorna o primeiro elemento da Stream
    Optional<Integer> first = numbers.stream().findFirst();
    first.ifPresent(value -> System.out.println("\nPrimeiro número: " + value));

    // 13. findAny(): Retorna qualquer elemento da Stream (útil em streams
    // paralelas)
    Optional<Integer> any = numbers.stream().findAny();
    any.ifPresent(value -> System.out.println("Qualquer número: " + value));
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
