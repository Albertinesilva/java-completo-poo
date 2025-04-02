package expressoes.lambda.exemplo.comparator.application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import expressoes.lambda.exemplo.comparator.entities.Product;

public class Program {
  public static void main(String[] args) {
    
    cleanScreen();

    List<Product> list = new ArrayList<>();

    list.add(new Product("TV", 900.0));
    list.add(new Product("Notebook", 1200.0));
    list.add(new Product("Tablet", 400.0));
    list.add(new Product("Ar-condicionado", 500.0));


    // Usando MyComparator como classe separada
    list.sort(new MyComparator());

    /**
    * @description Cria um Comparator objeto de classe anônima para comparar produtos com base no nome.
    * A comparação é feita ignorando diferenças entre maiúsculas e minúsculas, convertendo os nomes para letras maiúsculas.
    * 
    * @param p1 O primeiro produto a ser comparado.
    * @param p2 O segundo produto a ser comparado.
    * 
    * @return Um valor inteiro que indica a ordem dos produtos:
    *         - Um número negativo se p1 for menor que p2.
    *         - Zero se forem iguais.
    *         - Um número positivo se p1 for maior que p2.
    */
    Comparator<Product> compa = new Comparator<Product>() {
      @Override
      public int compare(Product p1, Product p2) {
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
      }
    };

    list.sort(compa);

    /**
    * @description Cria um comparador para ordenar produtos com base no nome em ordem alfabética.
    * A comparação ignora diferenças entre maiúsculas e minúsculas, convertendo os nomes para letras maiúsculas.
    * 
    * @param p1 O primeiro produto a ser comparado.
    * @param p2 O segundo produto a ser comparado.
    * 
    * @return Um valor inteiro que indica a ordem dos produtos:
    *         - Um número negativo se p1 for menor que p2.
    *         - Zero se forem iguais.
    *         - Um número positivo se p1 for maior que p2.
    */
    @SuppressWarnings("unused")
    Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

    /**
     * @description Ordena a lista de produtos em ordem alfabética com base no nome. A ordenação é feita ignorando diferenças 
     * entre maiúsculas e minúsculas.
     * @param p1 O primeiro produto a ser comparado.
     * @param p2 O segundo produto a ser comparado.
     */
    list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

    System.out.println("\nProducts:");
    for (Product p : list) {
      System.out.println(p);
    }
    System.out.println();
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
