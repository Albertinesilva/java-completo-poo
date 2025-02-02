package generics.collection.treeset.exemplo.application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program {
  public static void main(String[] args) {
    
    cleanScreen();

    // Criação de um conjunto TreeSet do tipo String
    // O TreeSet ordena automaticamente os elementos de forma natural (alfabética para Strings)
    Set<String> set = new TreeSet<>();

    // Adicionando elementos ao conjunto
    set.add("TV");
    set.add("Tablet");
    set.add("Notebook");
    set.add("Ar-condicionado");

    // Verificando se um elemento está presente no conjunto
    System.out.println("O conjunto contém 'Notebook'? " + set.contains("Notebook")); // Esperado: true

    // Iterando sobre os elementos do conjunto (ordem natural garantida pelo TreeSet)
    System.out.println("\nElementos no conjunto:");
    for (String item : set) {
      System.out.println(item);
    }

    // Exemplo com TreeSet para Inteiros
    Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10)); // Conjunto A
    Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10)); // Conjunto B

    // Exibindo os conjuntos A e B
    System.out.println("\nConjunto A: " + a);
    System.out.println("Conjunto B: " + b);

    // Operação de união (union)
    System.out.println("\nUnião A u B:");
    Set<Integer> union = new TreeSet<>(a); // Copia o conjunto A
    union.addAll(b); // Adiciona todos os elementos de B
    System.out.println(union);

    // Operação de interseção (intersection)
    System.out.println("\nInterseção A ∩ B:");
    Set<Integer> intersection = new TreeSet<>(a); // Copia o conjunto A
    intersection.retainAll(b); // Retém apenas os elementos que também estão em B
    System.out.println(intersection);

    // Operação de diferença (difference)
    System.out.println("\nDiferença A - B:");
    Set<Integer> difference = new TreeSet<>(a); // Copia o conjunto A
    difference.removeAll(b); // Remove os elementos que também estão em B
    System.out.println(difference);

    // Explicações adicionais
    System.out.println("\nEXPLICAÇÕES:");
    System.out.println("1. O TreeSet organiza os elementos em ordem natural (alfabética para Strings, crescente para números).");
    System.out.println("2. Operações de conjuntos:");
    System.out.println("   - União (Union): Combina todos os elementos de ambos os conjuntos.");
    System.out.println("   - Interseção (Intersection): Retém apenas os elementos presentes em ambos os conjuntos.");
    System.out.println("   - Diferença (Difference): Retém os elementos do primeiro conjunto que não estão no segundo.");
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
