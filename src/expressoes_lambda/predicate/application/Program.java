package expressoes_lambda.predicate.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import expressoes_lambda.predicate.entities.Product;
import expressoes_lambda.predicate.util.ProductPredicate;

public class Program {
  public static void main(String[] args) {
    limparTela();

    Locale.setDefault(Locale.US);
    List<Product> list = new ArrayList<>();
    list.add(new Product("Tv", 900.00));
    list.add(new Product("Mouse", 50.00));
    list.add(new Product("Tablet", 350.50));
    list.add(new Product("HD Case", 80.90));

    // Implementação de expressão lambda inline diretamente no método removeIf.
    // Remove produtos da lista cujo preço seja maior ou igual a 100.
    // Exemplo de uso de função anônima:
    // list.removeIf(p -> p.getPrice() >= 100);

    // Implementação utilizando uma classe que implementa a interface Predicate com o método test.
    // Remove produtos da lista com base no critério definido na classe ProductPredicate.
    // list.removeIf(new ProductPredicate());

    // Utiliza um método de referência para uma função estática da classe Product.
    // O método estático recebe o objeto Product como parâmetro e aplica o critério diretamente.
    // Remove os produtos da lista cujo preço seja maior ou igual a 100.00.
    list.removeIf(Product::staticProductPredicate);

    // Utiliza um método de referência para uma função não estática da classe Product.
    // O método não estático usa a instância do objeto Product (referência implícita) para aplicar o critério.
    // Remove os produtos da lista cujo preço da instância seja maior ou igual a 100.00.
    list.removeIf(Product::nonStaticProductPredicate);

    // Define uma variável Predicate que representa uma condição.
    // Remove os produtos da lista cujo preço seja maior ou igual ao valor mínimo definido.
    double min = 100; 
    Predicate<Product> pred = p -> p.getPrice() >= min; 
    list.removeIf(pred);

    // Usa uma expressão lambda  inline diretamente no método removeIf.
    // Remove os produtos da lista cujo preço seja maior ou igual ao valor mínimo definido.
    list.removeIf(p -> p.getPrice() >= min);

    for (Product p : list) {
      System.out.println(p);
    }

    System.out.println("\nRemovendo produtos com preço maior ou igual a 100 usando expressão lambda inline:");
    
    // Limpa a lista e adiciona novos produtos.
    list.clear();
    list.add(new Product("Computer", 120.50));
    list.add(new Product("TV", 90.90));
    list.add(new Product("Notebook", 150.00));

    /* A linha abaixo usa uma expressão lambda inline para remover elementos da lista.
     A expressão lambda `p -> p.nonStaticProductPredicate()` funciona da seguinte forma:
     - Para cada elemento `p` do tipo `Product` na lista, o método `nonStaticProductPredicate`
     é chamado na instância `p`.
     - O método `nonStaticProductPredicate` retorna um booleano que indica se o produto 
     atende ao critério (neste caso, se o preço é maior ou igual a 100).
     - Se o método retornar `true`, o elemento é removido da lista.
     Essa abordagem é concisa e aproveita a funcionalidade do método `removeIf` junto com 
     expressões lambda, uma funcionalidade introduzida no Java 8. */
    list.removeIf(p -> p.nonStaticProductPredicate());

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
