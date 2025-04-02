package expressoes.lambda.consumer.application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import expressoes.lambda.consumer.entities.Product;
import expressoes.lambda.consumer.util.PriceUpdate;

public class Program {

  public static void main(String[] args) {
    
    cleanScreen();

    List<Product> list = new ArrayList<>();

    list.add(new Product("Tv", 900.00));
    list.add(new Product("Mouse", 50.00));
    list.add(new Product("Tablet", 350.50));
    list.add(new Product("HD Case", 80.90));

    System.out.println("\nLista de Produtos Original:");
    list.forEach(System.out::println);

    // Implementação da interface Consumer
    System.out.println("\nUtilizando a interface Consumer para atualizar o preço dos produtos em 10% (PriceUpdate).");
    list.forEach(new PriceUpdate());
    list.forEach(System.out::println);

    // Reference method com método estático
    System.out.println("\nUtilizando um método estático para atualizar o preço dos produtos em 10% (Product::staticPriceUpdate).");
    list.forEach(Product::staticPriceUpdate);
    list.forEach(System.out::println);

    // Reference method com método não estático
    System.out.println("\nUtilizando um método não estático para atualizar o preço dos produtos em 10% (Product::nonStaticPriceUpdate).");
    list.forEach(Product::nonStaticPriceUpdate);
    list.forEach(System.out::println);

    // Expressão lambda declarada
    System.out.println("\nUtilizando uma expressão lambda declarada para atualizar o preço dos produtos em 10%.");
    Double factor1 = 1.1;
    Consumer<Product> cons = p -> p.setPrice(p.getPrice() * factor1);
    list.forEach(cons);
    list.forEach(System.out::println);

    // Expressão lambda inline
    System.out.println("\nUtilizando uma expressão lambda inline para atualizar o preço dos produtos em 10%.");
    double factor2 = 1.1;
    list.forEach(p -> p.setPrice(p.getPrice() * factor2));
    list.forEach(System.out::println);

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
