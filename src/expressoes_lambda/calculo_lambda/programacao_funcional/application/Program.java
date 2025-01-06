package expressoes_lambda.calculo_lambda.programacao_funcional.application;

import java.util.ArrayList;
import java.util.List;

import expressoes_lambda.calculo_lambda.programacao_funcional.entities.Product;

public class Program {

  public static int compareProducts(Product p1, Product p2) {
    return p1.getPrice().compareTo(p2.getPrice());
  }

  public static void main(String[] args) {
    limparTela();

    List<Product> list = new ArrayList<>();

    list.add(new Product("TV", 900.00));
    list.add(new Product("Notebook", 1200.00));
    list.add(new Product("Tablet", 450.00));

    list.sort(Program::compareProducts);

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
