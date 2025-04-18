package employee;

import java.util.Locale;
import java.util.Scanner;

public class EmployeeRun {
    
    public static void main(String[] args) throws Exception{

        cleanScreen();
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Employee:\n");

        System.out.printf("Name: ");
        employee.name = scan.nextLine();

        System.out.printf("Gross salary: ");
        employee.grossSalary = scan.nextDouble();

        System.out.printf("Tax: ");
        employee.tax = scan.nextDouble();

        System.out.println("Employee: " + employee.toString());

        System.out.printf("\nWhich percentage to increase salary? ");
        double percentage = scan.nextDouble();

        employee.increaseSalary(percentage);

        System.out.println("Update data: " + employee.toString());

        scan.close();
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
