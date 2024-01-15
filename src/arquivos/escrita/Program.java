package arquivos.escrita;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
  
  public static void main(String[] args) {
    
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
}
