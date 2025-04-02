package excecoes.estrutura;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

  public static void main(String[] args) {

    cleanScreen();
    Scanner scan = new Scanner(System.in);

    try {
      System.out.print("Provide the values for the vector: ");
      String[] vect = scan.nextLine().split(" ");

      System.out.print("Provide the index: ");
      int position = scan.nextInt();
      System.out.println(vect[position]);

    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Invalid position!");

    } catch (InputMismatchException e) {
      System.out.println("Input error!");
    }

    System.out.println("End of program");

    scan.close();
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
