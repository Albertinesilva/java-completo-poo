package interfaces.default_methods.application;

import java.util.Locale;
import java.util.Scanner;

import interfaces.default_methods.services.BrazilInterestService;
import interfaces.default_methods.services.InterestService;

public class Program {

  public static void main(String[] args) {
    
    cleanScreen();
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Amount: ");
    double amount = sc.nextDouble();
    System.out.print("Months: ");
    int months = sc.nextInt();

    InterestService is = new BrazilInterestService(1.0);
    double payment = is.payment(amount, months);

    System.out.println("Payment after " + months + " months:");
    System.out.println(String.format("%.2f", payment));

    sc.close();
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