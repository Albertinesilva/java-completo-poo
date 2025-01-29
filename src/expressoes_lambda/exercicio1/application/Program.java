package expressoes_lambda.exercicio1.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import expressoes_lambda.exercicio1.entities.Product;

public class Program {
  public static void main(String[] args) {
    limparTela();

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter full file path: ");
    String path = sc.nextLine();

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {

      List<Product> list = new ArrayList<>();

      String line = br.readLine();
      while (line != null) {
        String[] fields = line.split(",");
        list.add(new Product(fields[0], Double.parseDouble(fields[1])));
        line = br.readLine();
      }
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
