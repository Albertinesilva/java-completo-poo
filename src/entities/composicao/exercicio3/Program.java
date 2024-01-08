package entities.composicao.exercicio3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.composicao.exercicio3.enums.OrderStatus;

public class Program {

  public static void main(String[] args) throws ParseException {

    limparTela();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter cliente data:");
    System.out.print("Name: ");
    String name = sc.nextLine();

    System.out.print("Email: ");
    String email = sc.nextLine();

    System.out.print("Birth date (DD/MM/YYYY): ");
    Date birthDate = sdf.parse(sc.next());

    Client client = new Client(name, email, birthDate);

    System.out.println();
    System.out.println("Enter order data:");
    System.out.print("Status: ");
    OrderStatus status = OrderStatus.valueOf(sc.next());

    Order order = new Order(new Date(), status, client);

    System.out.println("How many items to this order? ");
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      System.out.println("Enter #" + i + " item data:");
      System.out.print("Product name: ");
      sc.nextLine();
      String productName = sc.nextLine();

      System.out.print("Product price: ");
      double productPrice = sc.nextDouble();

      System.out.print("Quantity: ");
      int quantity = sc.nextInt();

      Product product = new Product(productName, productPrice);
      order.addItem(new OrderItem(quantity, productPrice, product));
    }

    System.out.println();
    System.out.println("ORDER SUMMARY:");
    System.out.println(order);

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