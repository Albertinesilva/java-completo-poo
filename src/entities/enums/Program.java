package entities.enums;

import java.util.Date;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    limparTela();

    Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

    System.out.println(order);

    OrderStatus os1 = OrderStatus.DELIVERED;
    OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

    System.out.println(os1);
    System.out.println(os2);
    System.out.println("\n");

    scan.close();
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

  public static void pausar(Scanner scan) {
    System.out.print("\n\tPressione ENTER para continuar...");
    scan.nextLine();
  }

}
