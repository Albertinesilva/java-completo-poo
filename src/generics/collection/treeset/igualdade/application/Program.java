package generics.collection.treeset.igualdade.application;

import java.util.Set;
import java.util.TreeSet;

import generics.collection.treeset.igualdade.entities.Product;

public class Program {
  public static void main(String[] args) {
    limparTela();

    Set<Product> set = new TreeSet<>();

    set.add(new Product("TV", 900.0));
    set.add(new Product("Notebook", 1200.0));
    set.add(new Product("Tablet", 400.0));
    set.add(new Product("Ar-condicionado", 500.0));

    System.out.println("\nTreeSet:");
    for (Product p : set) {
      System.out.println(p);
    }
    System.out.println();
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
