package interfaces.interface_comparable.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import interfaces.interface_comparable.entities.Employee;

public class Program {
  public static void main(String[] args) {
    limparTela();
    List<Employee> list = new ArrayList<>();
    String path = "D:\\UDEMY POO\\Exercicios\\src\\interfaces\\interface_comparable\\in.txt";

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {

      String employeeCv = br.readLine();
      while (employeeCv != null) {
        String[] fields = employeeCv.split(",");
        list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
        employeeCv = br.readLine();
      }

      Collections.sort(list);
      for (Employee emp : list) {
        System.out.println(emp.getName() + ", " + String.format("%.2f", emp.getSalary()));
      }
      
    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
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
