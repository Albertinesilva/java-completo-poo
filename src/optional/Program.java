package optional;

import java.util.Optional;

public class Program {

  public static void main(String[] args) {

    cleanScreen();
    
    Optional<String> optionalString = Optional.of("Hello");

    // Verifica se o valor está presente e imprime
    if (optionalString.isPresent()) {
      System.out.println(optionalString.get()); // Saída: Hello
    }

    // Utilizando ifPresent para executar uma ação se o valor estiver presente
    optionalString.ifPresent(str -> System.out.println("Valor presente: " + str)); // Saída: Valor presente: Hello

    // Modo mais seguro de obter o valor (caso esteja presente)
    String result = optionalString.orElse("Valor padrão");
    System.out.println(result); // Saída: Hello

    // Utilizando orElseGet para obter o valor padrão de forma lazy
    String resultLazy = optionalString.orElseGet(() -> "Valor padrão obtido de forma lazy");
    System.out.println(resultLazy); // Saída: Hello

    // Criando um Optional vazio
    Optional<String> emptyOptional = Optional.empty();

    // Usando orElse para fornecer um valor padrão se o Optional estiver vazio
    String emptyResult = emptyOptional.orElse("Valor padrão");
    System.out.println(emptyResult); // Saída: Valor padrão

    // emptyOptional = Optional.of("Hello");
    
    // Lançando uma exceção se o valor estiver ausente
    try {
      String value = emptyOptional.orElseThrow(() -> new IllegalArgumentException("Valor ausente"));
      System.out.println("Valor: " + value);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage()); // Saída: Valor ausente
    }

    // System.out.println(emptyOptional.get());
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
