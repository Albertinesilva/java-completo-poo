package expressoes_lambda.exercicio1.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import expressoes_lambda.exercicio1.entities.Product;

public class Program {

  public static void main(String[] args) {
    limparTela();

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter full file path: ");
    String path = "D:\\UDEMY POO\\projetos-poo-java\\src\\expressoes_lambda\\exercicio1\\in.txt";

    // Usa try-with-resources para garantir que o BufferedReader seja fechado corretamente
    try (BufferedReader br = new BufferedReader(new FileReader(path))) {

      List<Product> list = new ArrayList<>(); // Lista para armazenar os produtos lidos do arquivo

      String line = br.readLine(); // Lê a primeira linha do arquivo
      while (line != null) {
        String[] fields = line.split(","); // Divide a linha pelo separador ","

        // Adiciona um novo produto à lista, convertendo o preço para double
        list.add(new Product(fields[0], Double.parseDouble(fields[1])));

        line = br.readLine(); // Lê a próxima linha
      }

      /**
       * Calcula o preço médio de todos os produtos na lista.
       * @return Média dos preços dos produtos.
       */
      double svg = list.stream()
          .map(p -> p.getPrice()) // Obtém os preços dos produtos
          .reduce(0.0, (x, y) -> x + y) // Soma todos os preços
          / list.size(); // Divide pelo número total de produtos para obter a média

      System.out.println("\nAverage price: " + String.format("%.2f", svg)); // Exibe o preço médio formatado

      /**
       * @description Define um comparador para ordenar os nomes dos produtos em ordem alfabética (case insensitive).
       */
      Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

      /**
       * @description Filtra os produtos com preço abaixo da média, extrai os nomes,
       * ordena em ordem decrescente e os coleta em uma lista.
       * @return Lista de nomes dos produtos abaixo do preço médio, ordenados em ordem decrescente.
       */
      List<String> names = list.stream()
          .filter(p -> p.getPrice() < svg) // Filtra produtos com preço abaixo da média
          .map(p -> p.getName()) // Obtém os nomes dos produtos
          .sorted(comp.reversed()) // Ordena em ordem decrescente
          .collect(Collectors.toList()); // Coleta os nomes em uma lista

      names.forEach(System.out::println); // Exibe os nomes dos produtos filtrados

    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    }
    sc.close();
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
