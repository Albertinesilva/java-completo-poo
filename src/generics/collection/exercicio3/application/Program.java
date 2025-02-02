package generics.collection.exercicio3.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    
    cleanScreen();
    Scanner sc = new Scanner(System.in);

    Map<String, Integer> votes = new LinkedHashMap<>();

    // D:\\UDEMY POO\\projetos-poo-java\\src\\generics\\collection\\exercicio3\\temp\\in.txt
    System.out.print("Enter file full path: ");
    String path = sc.nextLine();

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {

      String line = br.readLine();
      while (line != null) {

        String[] fields = line.split(",");
        String name = fields[0];
        int count = Integer.parseInt(fields[1]);

        if (votes.containsKey(name)) {
          int votesSoFar = votes.get(name);
          votes.put(name, count + votesSoFar);
        } else {
          votes.put(name, count);
        }

        line = br.readLine();
      }

      System.out.println("\nCandidatos mais votados:");
      for (String key : votes.keySet()) {
        System.out.println(key + ": " + votes.get(key));
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
