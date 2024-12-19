package interfaces.heranca_e_interface.application;

import interfaces.heranca_e_interface.model.enums.Color;
import interfaces.heranca_e_interface.model.entities.AbstractShape;
import interfaces.heranca_e_interface.model.entities.Circle;

public class Program {

  public static void main(String[] args) {
    limparTela();
    AbstractShape s1 = new Circle(Color.BLACK, 2.0);
    AbstractShape s2 = new Circle(Color.WHITE, 3.0);

    System.out.println("Circle 1 color: " + s1.getColor());
    System.out.println("Circle 1 area: " + String.format("%.3f", s1.area()));
    System.out.println("Rectangle color: " + s2.getColor());
    System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));
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
