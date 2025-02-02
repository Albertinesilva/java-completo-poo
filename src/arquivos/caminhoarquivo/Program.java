package arquivos.caminhoarquivo;

import java.io.File;
import java.util.Scanner;

public class Program {
  
  public static void main(String[] args) {
    
    cleanScreen();
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a file path: ");
    String strPath = sc.nextLine();

    File path = new File(strPath);

    System.out.println("getName: " + path.getName());
    System.out.println("getParent: " + path.getParent());
    System.out.println("getPath: " + path.getPath());

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
