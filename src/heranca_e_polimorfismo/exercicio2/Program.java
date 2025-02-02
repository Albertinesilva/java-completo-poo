package heranca_e_polimorfismo.exercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

  public static void main(String[] args) {

    limparTela();
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number of tax payers: ");
    int n = sc.nextInt();

    List<TaxPayer> taxPayers = new ArrayList<>();

    for (int i = 1; i <= n; i++) {

      System.out.println("Tax payer #" + i + " data:");
      System.out.print("Individual or company (i/c)? ");
      char type = sc.next().charAt(0);

      System.out.print("Name: ");
      sc.nextLine();
      String name = sc.nextLine();

      System.out.print("Anual income: ");
      Double anualIncome = sc.nextDouble();

      if (type == 'i') {

        System.out.print("Health expenditures: ");
        Double healthExpenditures = sc.nextDouble();
        taxPayers.add(new Individual(name, anualIncome, healthExpenditures));
      } else {
        System.out.print("Number of employees: ");
        Integer numberOfEmployees = sc.nextInt();
        taxPayers.add(new Company(name, anualIncome, numberOfEmployees));
      }

    }

    System.out.println();
    System.out.println("TAXES PAID:");
    for (TaxPayer taxPayer : taxPayers) {
      System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f", taxPayer.tax()));
    }

    System.out.println();
    double sum = 0.0;
    for (TaxPayer taxPayer : taxPayers) {
      sum += taxPayer.tax();
    }

    System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

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
