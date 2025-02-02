package generics.collection.exercicio1.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import generics.collection.exercicio1.entities.LogEntry;

public class Program {

  public static void main(String[] args) {
    
    cleanScreen();
    Scanner sc = new Scanner(System.in);

    // D:\\UDEMY POO\\projetos-poo-java\\src\\generics\\collection\\exercicio1\\temp\\in.txt 
    System.out.print("\nEnter file full path: ");
    String path = sc.nextLine();

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {

      Set<LogEntry> set = new HashSet<>();

      String line = br.readLine();
      while (line != null) {
        String[] fields = line.split(" ");
        String username = fields[0];
        Date moment = Date.from(Instant.parse(fields[1]));

        set.add(new LogEntry(username, moment));

        line = br.readLine();
      }
      System.out.println("\nTotal users: " + set.size() + "\n");

      // Listando os dados do arquivo
      System.out.println("Log Entries:");
      for (LogEntry entry : set) {
        System.out.println(entry);
      }

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
