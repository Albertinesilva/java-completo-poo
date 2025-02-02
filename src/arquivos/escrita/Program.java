package arquivos.escrita;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
  
  public static void main(String[] args) {

    cleanScreen();
    
    String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };

    String path = "D:\\UDEMY(POO)\\exercicios\\src\\arquivos\\escrita\\dados\\out.txt";

    try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
      
      for (String line : lines) {
        bw.write(line);
        bw.newLine();
      }

      bw.close();
    }
    catch(IOException e){
      e.printStackTrace();
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
