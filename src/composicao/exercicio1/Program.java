package composicao.exercicio1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import composicao.exercicio1.enums.WorkerLevel;

public class Program {

  public static void main(String[] args) throws ParseException {

    limparTela();
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    System.out.print("Enter department's name: ");
    String departmentName = sc.nextLine();

    System.out.println("Enter worker data:");
    System.out.print("Name: ");
    String workerName = sc.nextLine();

    System.out.print("Level: ");
    String workerLevel = sc.nextLine();

    System.out.print("Base salary: ");
    double baseSalary = sc.nextDouble();

    Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary,
        new Department(departmentName));

    System.out.print("How many contracts to this worker? ");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      System.out.println("Enter contract #" + i + " data:");

      System.out.print("Date (DD/MM/YYYY): ");
      sc.nextLine();
      String contractDate = sc.nextLine();

      System.out.print("Value per hour: ");
      double valuePerHour = sc.nextDouble();

      System.out.print("Duration (hours): ");
      int hours = sc.nextInt();

      // HourContract contract = new HourContract(sdf.parse(contractDate),
      // valuePerHour, hours);
      worker.addContract(new HourContract(sdf.parse(contractDate), valuePerHour, hours));
    }

    System.out.println();
    System.out.print("Enter month and year to calculate income (MM/YYYY): ");
    String monthAndYear = sc.next();
    int month = Integer.parseInt(monthAndYear.substring(0, 2));
    int year = Integer.parseInt(monthAndYear.substring(3));

    System.out.println("Name: " + worker.getName());
    System.out.println("Department: " + worker.getDepartment().getName());
    System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(month, year)));

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
