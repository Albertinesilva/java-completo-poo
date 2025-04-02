package expressoes.lambda.exercicio2.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import expressoes.lambda.exercicio2.entities.Employee;

public class Program {

  public static void main(String[] args) {
    
    cleanScreen();
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter full file path: ");
    String path = "D:\\UDEMY POO\\projetos-poo-java\\src\\expressoes_lambda\\exercicio2\\in.txt";

    // Usa try-with-resources para garantir que o BufferedReader seja fechado
    // corretamente
    try (BufferedReader br = new BufferedReader(new FileReader(path))) {

      List<Employee> list = new ArrayList<>(); // Lista para armazenar os empregados do arquivo de entrada

      String line = br.readLine(); // Lê a primeira linha do arquivo
      while (line != null) {
        String[] fields = line.split(","); // Divide a linha pelo separador ","

        // Adiciona um novo empregado à lista, com os campos obtidos da linha atual
        list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));

        line = br.readLine(); // Lê a próxima linha
      }

      System.out.print("Enter salary: ");
      double salary = sc.nextDouble();

      /**
       * Filtra os funcionários com salário superior a um valor especificado,
       * extrai os e-mails, ordena-os alfabeticamente e os armazena em uma lista.
       */
      List<String> emails = list.stream()
          .filter(x -> x.getSalary() > salary) // Filtra funcionários com salário maior que o especificado
          .map(x -> x.getEmail()) // Mapeia para os e-mails
          .sorted() // Ordena os e-mails em ordem alfabética
          .collect(Collectors.toList()); // Coleta os e-mails em uma lista

      /**
       * Imprime os e-mails das pessoas cujo salário é maior que o valor especificado.
       */
      System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary) + ":");
      emails.forEach(System.out::println); // Imprime cada e-mail filtrado

      /**
       * Calcula a soma dos salários dos funcionários cujo nome começa com a letra 'M'.
       */
      double sum = list.stream()
          .filter(x -> Character.toUpperCase(x.getName().charAt(0)) == 'M') // Filtra funcionários cujo nome começa com 'M'
          .map(x -> x.getSalary()) // Mapeia para os salários
          .reduce(0.0, (x, y) -> x + y); // Soma os salários

      System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));

    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
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
