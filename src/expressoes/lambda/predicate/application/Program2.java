package expressoes.lambda.predicate.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import expressoes.lambda.predicate.entities.Product;

public class Program2 {

  public static void main(String[] args) {
    cleanScreen();
    Locale.setDefault(Locale.US);

    // Exemplo com expressão lambda inline
    List<Product> list1 = initializeProducts();
    System.out.println("Exemplo com expressão lambda inline:");
    list1.removeIf(p -> p.getPrice() >= 100);
    list1.forEach(System.out::println);

    // Exemplo com método estático
    List<Product> list2 = initializeProducts();
    System.out.println("\nExemplo com método estático:");
    list2.removeIf(Product::staticProductPredicate);
    list2.forEach(System.out::println);

    // Exemplo com método não estático
    List<Product> list3 = initializeProducts();
    System.out.println("\nExemplo com método não estático:");
    list3.removeIf(Product::nonStaticProductPredicate);
    list3.forEach(System.out::println);

    // Exemplo com variável Predicate
    List<Product> list4 = initializeProducts();
    double min = 100;
    Predicate<Product> pred = p -> p.getPrice() >= min;
    System.out.println("\nExemplo com variável Predicate:");
    list4.removeIf(pred);
    list4.forEach(System.out::println);
  }

  public static List<Product> initializeProducts() {
    List<Product> products = new ArrayList<>();
    products.add(new Product("Tv", 900.00));
    products.add(new Product("Mouse", 50.00));
    products.add(new Product("Tablet", 350.50));
    products.add(new Product("HD Case", 80.90));
    return products;
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
