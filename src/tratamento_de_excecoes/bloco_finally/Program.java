package tratamento_de_excecoes.bloco_finally;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

  public static void main(String[] args) {

    cleanScreen();
    
    File file = new File("D:\\UDEMY POO\\projetos-poo-java\\src\\tratamento_de_excecoes\\bloco_finally\\dados\\in.txt");
    Scanner scan = null;

    try {
      scan = new Scanner(file);
      while (scan.hasNextLine()) {
        System.out.println(scan.nextLine());
      }
    } 
    catch (FileNotFoundException e) {
      System.out.println("Error opening file: " + e.getMessage());

    } 
    finally {
      if (scan != null) {
        scan.close();
      }
      System.out.println("Finally block executed");
    }
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
