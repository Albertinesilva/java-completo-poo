package comportamento_de_memoria_arrays_listas.vetores.exercicio.somavetor;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetorRun {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.printf("\nQuantos numeros voce vai digitar? ");
        int n = scan.nextInt();
        SomaVetor[] somaVector = new SomaVetor[n];

        for(int i = 0; i < somaVector.length; i++){
            scan.nextLine();
            System.out.printf("Digite um numero: ");
            double number = scan.nextDouble();
            somaVector[i] = new SomaVetor(number);
        }

        System.out.printf("\nVALORES = %.1f, %.1f, %.1f, %.1f",somaVector[0].getNumber(), 
                                                                      somaVector[1].getNumber(), 
                                                                      somaVector[2].getNumber(), 
                                                                      somaVector[3].getNumber());

        SomaVetor somaVetor = new SomaVetor();
        double soma = 0;
        soma = somaVetor.soma(n, somaVector);
        somaVetor.media(soma);

        scan.close();
    }
}
