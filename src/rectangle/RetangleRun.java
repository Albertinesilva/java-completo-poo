package rectangle;

import java.util.Locale;
import java.util.Scanner;

public class RetangleRun {

    public static void main(String[] args) throws Exception {

        cleanScreen();
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.print("Enter rectangle width and height:\n");

        System.out.printf("Width: ");
        rectangle.width = scan.nextDouble();

        System.out.printf("Height: ");
        rectangle.height = scan.nextDouble();

        System.out.printf("\n" + rectangle.toString());

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
