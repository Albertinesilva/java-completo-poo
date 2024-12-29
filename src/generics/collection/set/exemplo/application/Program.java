package generics.collection.set.exemplo.application;

import java.util.HashSet;
import java.util.Set;

public class Program {
  public static void main(String[] args) {
    limparTela();

    // Criando um conjunto HashSet do tipo String
    // O HashSet não mantém a ordem dos elementos, mas garante unicidade
    Set<String> set = new HashSet<>();

    // Adicionando elementos ao conjunto
    set.add("TV");
    set.add("Notebook");
    set.add("Tablet");
    set.add("Ar-condicionado");

    // Verificando se um elemento está presente no conjunto
    System.out.println("O conjunto contém 'Notebook'? " + set.contains("Notebook")); // Esperado: true

    // Iterando sobre os elementos do conjunto
    System.out.println("\nElementos no conjunto:");
    for (String item : set) {
      System.out.println(item);
    }

    // Exibindo o tamanho do conjunto
    System.out.println("\nTamanho do Set: " + set.size());

    // Removendo um elemento específico do conjunto
    System.out.println("\nRemovendo o item 'Tablet'...");
    set.remove("Tablet");

    // Iterando novamente para mostrar o conjunto atualizado
    System.out.println("Elementos após remoção:");
    for (String item : set) {
      System.out.println(item);
    }

    // Usando predicado para remover elementos que começam com 'A'
    System.out.println("\nRemovendo todos os elementos que começam com 'A':");
    set.removeIf(x -> x.charAt(0) == 'A');

    // Exibindo os elementos restantes após a remoção
    System.out.println("Elementos após remoção por predicado (começam com 'A'):");
    for (String item : set) {
      System.out.println(item);
    }

    // Usando predicado para remover elementos com mais de 3 caracteres
    System.out.println("\nRemovendo todos os elementos que têm mais de 3 caracteres:");
    set.removeIf(x -> x.length() > 3);

    // Exibindo os elementos restantes após a remoção
    System.out.println("Elementos após remoção por predicado (mais de 3 caracteres):");
    for (String item : set) {
      System.out.println(item);
    }

    // Explicações adicionais
    System.out.println("\nEXPLICAÇÕES:");
    System.out.println("1. HashSet é uma implementação baseada em tabela hash, garantindo que os elementos sejam únicos.");
    System.out.println("2. A ordem dos elementos não é garantida em um HashSet.");
    System.out.println("3. O método removeIf() utiliza predicados (expressões booleanas) para remover elementos que atendem à condição.\n\n");
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
