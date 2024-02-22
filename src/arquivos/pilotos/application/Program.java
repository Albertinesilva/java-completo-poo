package arquivos.pilotos.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import arquivos.pilotos.entities.Piloto;

public class Program {

  public static void main(String[] args) {

    String path = "D:\\UDEMY(POO)\\Exercicios\\src\\arquivos\\pilotos\\pilotos.csv";

    List<Piloto> list = new ArrayList<>();
    BufferedReader br = null;

    try {
      br = new BufferedReader(new FileReader(path));

      String line = br.readLine();
      line = br.readLine();

      while (line != null) {

        String[] fields = line.split(";");
        String pais = fields[0];
        String nome = fields[1];
        Integer numVitorias = Integer.parseInt(fields[2]);

        list.add(new Piloto(pais, nome, numVitorias));
        line = br.readLine();
      }

      System.out.println("Pilotos:");
      for (Piloto piloto : list) {
        System.out.println(piloto);
      }

    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    } finally {
      System.out.println("Fim do programa");

      try {

        if (br != null) {
          br.close();
        }

      } catch (IOException e) {
        System.out.println("Error ao fechar BufferedReader: " + e.getMessage());
      }
    }
  }
}
