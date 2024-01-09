package entities.heranca.classabstract;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {

  public static void main(String[] args) {

    limparTela();
    Locale.setDefault(Locale.US);
    // Account acc1 = new Account(1001, "Alex", 1000.0);
    // Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
    // Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);

    List<Account> list = new ArrayList<>();

    list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
    list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
    list.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
    list.add(new BusinessAccount(1005, "Anna", 500.0, 500.0));

    double sum = 0.0;
    for (Account acc : list) {
      sum += acc.getBalance();
    }

    System.out.println("Total balance: " + String.format("%.2f", sum));

    for (Account acc : list) {
      acc.deposit(10.0);
    }

    for (Account acc : list) {
      System.out
          .println("Updated balance for account " + acc.getNumber() + ": " + String.format("%.2f", acc.getBalance()));
    }

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
