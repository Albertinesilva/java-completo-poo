package generics.collection.set.igualdade.application;

import java.util.HashSet;
import java.util.Set;

import generics.collection.set.igualdade.entities.Product;

public class Program {
  public static void main(String[] args) {
    
    cleanScreen();

    Set<Product> set = new HashSet<>();

    set.add(new Product("TV", 900.0));
    set.add(new Product("Notebook", 1200.0));
    set.add(new Product("Tablet", 400.0));

    Product prod = new Product("Notebook", 1200.0);
    
    System.out.println("Contém 'Notebook'? " + set.contains(prod) + "\n");
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
