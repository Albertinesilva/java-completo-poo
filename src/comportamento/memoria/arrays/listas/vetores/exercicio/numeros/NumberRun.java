package comportamento.memoria.arrays.listas.vetores.exercicio.numeros;

import java.util.Locale;
import java.util.Scanner;

public class NumberRun {
    
    public static void main(String[] args) throws Exception{

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.printf("Quantos números você vai digitar? ");
        int n = scan.nextInt();
        while(n > 10){
            n = scan.nextInt();
        }
        Number[] vect = new Number[n];

        for(int i = 0; i < vect.length; i++){
            System.out.printf("\nDigite o %dº Número: ", i + 1);
            int number = scan.nextInt();
            vect[i] = new Number(number);
        }

        System.out.printf("\nNúmeros negativos:");
        for(int y = 0; y < vect.length; y++){
            
            if(vect[y].getNumber() < 0){
                System.out.printf("\n%d",vect[y].getNumber());
            }
        }

        scan.close();
    }
}
