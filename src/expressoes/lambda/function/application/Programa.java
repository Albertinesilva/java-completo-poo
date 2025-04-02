package expressoes.lambda.function.application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import expressoes.lambda.function.entities.Product;
import expressoes.lambda.function.util.UpperCaseName;

public class Programa {

  public static void main(String[] args) {
    cleanScreen();
    List<Product> list = new ArrayList<>();
    list.add(new Product("Tv", 900.00));
    list.add(new Product("Mouse", 50.00));
    list.add(new Product("Tablet", 350.50));
    list.add(new Product("HD Case", 80.90));

    System.out.println("\nLista de Produtos Original:");
    list.forEach(System.out::println);

    // Implementação da interface Function
    System.out.println("\nUtilizando a interface Function para converter o nome dos produtos para maiúsculas (UpperCaseName).");
    List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
    names.forEach(System.out::println);

    // Reference method com método estático
    System.out.println("\nUtilizando um método estático para converter o nome dos produtos para maiúsculas (Product::staticUpperCaseName).");
    names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
    names.forEach(System.out::println);

    // Reference method com método não estático
    System.out.println("\nUtilizando um método não estático para converter o nome dos produtos para maiúsculas (Product::nonStaticUpperCaseName).");
    names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
    names.forEach(System.out::println);

    // Expressão lambda declarada
    System.out.println("\nUtilizando uma expressão lambda declarada para converter o nome dos produtos para maiúsculas.");
    Function<Product, String> func = p -> p.getName().toUpperCase();
    List<String> names2 = list.stream().map(func).collect(Collectors.toList());
    names2.forEach(System.out::println);

    // Expressão lambda inline
    System.out.println("\nUtilizando uma expressão lambda inline para converter o nome dos produtos para maiúsculas.");
    List<String> names3 = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
    names3.forEach(System.out::println);
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
