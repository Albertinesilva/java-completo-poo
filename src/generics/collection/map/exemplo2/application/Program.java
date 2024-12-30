package generics.collection.map.exemplo2.application;

import java.util.HashMap;
import java.util.Map;

import generics.collection.map.exemplo2.entities.Product;

public class Program {
  public static void main(String[] args) {
    limparTela();

    Map<Product, Double> stock = new HashMap<>();

    Product p1 = new Product("Tv", 900.0);
    Product p2 = new Product("Notebook", 1200.0);
    Product p3 = new Product("Tablet", 400.0);

    stock.put(p1, 10000.0);
    stock.put(p2, 20000.0);
    stock.put(p3, 15000.0);

    Product ps = new Product("Tv", 900.0);

    System.out.println("\nProducts: ");
    for(Product p : stock.keySet()){
      System.out.println(p);
    }

    System.out.println("\nContains 'ps' key: " + stock.containsKey(ps));
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
