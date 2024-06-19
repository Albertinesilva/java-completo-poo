package rectangle;

import java.util.Locale;
import java.util.Scanner;

public class RetangleRun {

    public static void main(String[] args) throws Exception {

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
}
