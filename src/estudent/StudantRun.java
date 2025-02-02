package estudent;

import java.util.Scanner;
import java.util.Locale;

public class StudantRun {
    
    public static void main(String[] args) throws Exception{

        cleanScreen();
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Studant student = new Studant();

        System.out.printf("Name: ");
        student.name = scan.nextLine();

        System.out.printf("Nota 1: ");
        student.grade1 = scan.nextDouble();

        System.out.printf("Nota 2: ");
        student.grade2 = scan.nextDouble();

        System.out.printf("Nota 3: ");
        student.grade3 = scan.nextDouble();

        System.out.printf("\nFinal Grade: " + student.toString());
        student.missingPoints();

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
