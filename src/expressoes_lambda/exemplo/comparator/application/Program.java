package expressoes_lambda.exemplo.comparator.application;

import java.util.ArrayList;
import java.util.List;

import expressoes_lambda.exemplo.comparator.entities.Product;

public class Program {
  public static void main(String[] args) {
    limparTela();

    List<Product> list = new ArrayList<>();

    list.add(new Product("TV", 900.0));
    list.add(new Product("Notebook", 1200.0));
    list.add(new Product("Tablet", 400.0));
    list.add(new Product("Ar-condicionado", 500.0));

    list.sort(new MyComparator());

    System.out.println("\nProducts:");
    for (Product p : list) {
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
