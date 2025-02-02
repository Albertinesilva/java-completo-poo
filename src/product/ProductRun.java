package product;

import java.util.Locale;
import java.util.Scanner;

public class ProductRun {
    public static void main(String[] args) throws Exception {

        cleanScreen();
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter product data:\n");

        System.out.printf("Name: ");
        String name = scan.nextLine();

        System.out.printf("Price: ");
        double price = scan.nextDouble();

        Product product = new Product(name, price);

        System.out.println("\nProduct data: " + product);

        System.out.printf("\nEnter the number of products to be added in stock: ");
        int quantity = scan.nextInt();
        product.addProducts(quantity);

        System.out.printf("\nUpdate data: " + product + "\n");

        System.out.printf("\nEnter the number of products to be added in stock: ");
        quantity = scan.nextInt();
        product.removeProducts(quantity);

        System.out.printf("\nUpdate data: " + product);

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
