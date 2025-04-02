package heranca.exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

  public static void main(String[] args) {

    cleanScreen();
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    List<Employee> employees = new ArrayList<>();

    System.out.print("Enter the number of employees: ");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {

      System.out.println("Employee #" + i + " data:");
      System.out.print("Outsourced (y/n)? ");
      char ch = sc.next().charAt(0);

      System.out.print("Name: ");
      sc.nextLine();
      String name = sc.nextLine();

      System.out.print("Hours: ");
      int hours = sc.nextInt();

      System.out.print("Value per hour: ");
      double valuePerHour = sc.nextDouble();

      if (ch == 'y') {
        System.out.print("Additional charge: ");
        double additionalCharge = sc.nextDouble();
        employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
      } else {
        employees.add(new Employee(name, hours, valuePerHour));
      }
    }

    System.out.println();
    System.out.println("PAYMENTS:");
    for (Employee employee : employees) {
      System.out.println(employee.getName() + " - $ " + String.format("%.2f", employee.payment()));
    }

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
