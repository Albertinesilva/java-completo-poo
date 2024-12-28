package generics.exemplo.application;

import java.util.Scanner;

import generics.exemplo.services.PrintService;

public class Program {
  public static void main(String[] args) {
    limparTela();
    Scanner sc = new Scanner(System.in);

    PrintService<String> ps = new PrintService<>();

    System.out.print("How many values? ");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      String value = sc.next();
      ps.addValue(value);
    }

    ps.print();
    String x = ps.first();
    System.out.println("First: " + x);

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
