package comportamento_de_memoria_arrays_listas.vetores.exercicio.product;

import java.util.Locale;
import java.util.Scanner;

public class ProductsRun {

    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        double sum = 0;

        int n = scan.nextInt();
        Products[] vect = new Products[n];

        for (int i = 0; i < vect.length; i++) {
            scan.nextLine();
            String name = scan.nextLine();
            double price = scan.nextDouble();
            vect[i] = new Products(name, price);
            sum += vect[i].getPrice();
        }

        double avg = sum / vect.length;
        System.out.printf("AVERAGE PRICE: %.2f%n", avg);

        scan.close();

    }

}
