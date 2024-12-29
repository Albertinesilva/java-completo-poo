package generics.generics2.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import generics.generics2.services.CalculationService;

public class Program {
  public static void main(String[] args) {
    limparTela();
    Locale.setDefault(Locale.US);

    List<Integer> list = new ArrayList<>();

    String path = "D:\\UDEMY POO\\Exercicios\\src\\generics\\generics2\\temp\\in.txt";

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				list.add(Integer.parseInt(line));
				line = br.readLine();
			}

			Integer x = CalculationService.max(list);
			System.out.println("Max:");
			System.out.println(x);

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
