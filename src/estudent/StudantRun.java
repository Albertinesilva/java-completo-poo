package estudent;

import java.util.Scanner;
import java.util.Locale;

public class StudantRun {
    
    public static void main(String[] args) throws Exception{

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
}
