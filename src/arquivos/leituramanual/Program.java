package arquivos.leituramanual;

import java.io.BufferedReader;
import java.io.FileReader;

public class Program {

  public static void main(String[] args) {

    limparTela();
    String path = "D:\\UDEMY(POO)\\in.txt";
    FileReader fr = null;
    BufferedReader br = null;

    try {

      fr = new FileReader(path);
      br = new BufferedReader(fr);

      String line = br.readLine();

      while (line != null) {
        System.out.println(line);
        line = br.readLine();
      }

    } 
    catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    } 
    finally {
      try {
        if (br != null) {
          br.close();
        }
        if (fr != null) {
          fr.close();
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
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