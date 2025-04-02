package comportamento.memoria.arrays.listas.vetores.exercicio.rented;

import java.util.Locale;
import java.util.Scanner;

public class RentRun {

    public static void main (String[] ars) throws Exception{

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Rent[] vect = new Rent[10];

        System.out.print("How many rooms will be rented? ");
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            scan.nextLine();
            System.out.println("\nRent #" + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Email: ");
            String email = scan.nextLine();
            System.out.print("Room: ");
            int roomNamber = scan.nextInt();
            vect[roomNamber] = new Rent(name, email);
        }

        System.out.println("\nBusy rooms:");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] != null) {
                System.out.println(i
                + ": " 
                + vect[i].getName() 
                + ", " 
                + vect[i].getEmail());
            }
        }

        scan.close();

    }
   
}
