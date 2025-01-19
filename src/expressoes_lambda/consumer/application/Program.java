package expressoes_lambda.consumer.application;

import java.util.ArrayList;
import java.util.List;

import expressoes_lambda.consumer.entities.Product;

public class Program {

  public static void main(String[] args) {
    limparTela();

    List<Product> list = new ArrayList<>();

    list.add(new Product("Tv", 900.00));
    list.add(new Product("Mouse", 50.00));
    list.add(new Product("Tablet", 350.50));
    list.add(new Product("HD Case", 80.90));

    double factor = 1.1;

    list.forEach(p -> p.setPrice(p.getPrice() * factor));

    list.forEach(System.out::println);
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
