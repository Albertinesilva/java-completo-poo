package heranca.metodoabstract;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import heranca.metodoabstract.enums.Color;

public class Program {

  public static void main(String[] args) {

    limparTela();
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    List<Shape> list = new ArrayList<>();

    System.out.println("Enter the number of shapes: ");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {

      System.out.println("Shape #" + i + " data:");
      System.out.print("Rectangle or Circle (r/c)? ");
      char ch = sc.next().charAt(0);

      System.out.print("Color (BLACK/BLUE/RED): ");
      Color color = Color.valueOf(sc.next());

      if (ch == 'r') {

        System.out.print("Width: ");
        double width = sc.nextDouble();

        System.out.print("Height: ");
        double height = sc.nextDouble();

        list.add(new Rectangle(color, width, height));

      } else {
        System.out.print("Radius: ");
        double radius = sc.nextDouble();

        list.add(new Circle(color, radius));
      }
    }

    //Resultado do calculo das areas das formas, usando o metodo abstrato area() da classe Shape e o polimorfismo de forma 
    //implicita (atraves do foreach)
    System.out.println();
    System.out.println("SHAPE AREAS:");
    for (Shape shape : list) {
      System.out.println(String.format("%.2f", shape.area()));
    }



    sc.close();
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
