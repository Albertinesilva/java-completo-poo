package teste;

import java.util.Scanner;

public class CobaiaRun {

    public static void main(String argas[]) throws Exception {

        Scanner scan = new Scanner(System.in);
        
        int[] num = new int[10];

        entradaDeVetor(num, scan);

        imprimeVetor(num);

        maiorEMenorNumero(num);

        numerosPrimos(num);

        System.out.println((numeroTalConstaNoVetor(num, scan) != -1) ? "Consta no vetor" : "Não consta no vetor");

        calculo(num, scan);

        scan.close();
    }

    public static void entradaDeVetor(int[] vect, Scanner scan) {

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("\n\nDigite o %dº número: ", i + 1);
            vect[i] = scan.nextInt();

            if (vect[i] % 2 == 0) {
                System.out.printf("\n%d é par", vect[i]);
            } else {
                System.out.printf("\n%d é impar", vect[i]);
            }
        }
        System.out.println();
    }

    public static void imprimeVetor(int[] vect) {
        System.out.printf("\nNúmeros digitados:\n");
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("%d, ", vect[i]);
        }
        System.out.println();
    }

    public static void maiorEMenorNumero(int[] vect) {

        int num = 100;
        int maior = 0;
        int menor = vect[0];

        for (int i = 0; i < vect.length; i++) {

            if (vect[i] > num) {
                maior = vect[i];
            } else {
                if (num > maior) {
                    maior = num;
                }
            }
            if (vect[i] < menor) {
                menor = vect[i];
            }
        }
        System.out.printf("\nMaior número: %d\nMenor número: %d\n", maior, menor);

    }

    public static int numeroTalConstaNoVetor(int[] vect, Scanner scan) {

        int posicao = -1;
        System.out.println("\nDigite um número para verificação: ");
        int x = scan.nextInt();

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] == x) {
               return posicao = i;
            } 
        }
        return posicao;
    }

    public static void calculo(int[] vect, Scanner scan){

        int posicao = numeroTalConstaNoVetor(vect, scan);

        double total = (double)vect[posicao] + (vect[posicao] * 10) /100;
        System.out.println("Total: " + total + "\n");


    }

    public static int[] numerosPrimos(int[] vect) {

        int quant = 0;
        int[] primos = new int[10];
        boolean ePrimo;

        for (int i = 0; i < vect.length; i++) {

            int num = vect[i];
            ePrimo = true;
            while (ePrimo) {
                int divisivel = 0;
                for (int x = 1; x <= num; x++) {
                    if (num % x == 0) {
                        divisivel++;
                    }
                }
                if (divisivel == 2) {
                    primos[quant] = num;
                    quant++;
                    ePrimo = false;
                } else {
                    ePrimo = false;
                }
            }
        }
        System.out.println("\nNúmeros Primos: ");
        for (int y = 0; y < quant; y++) {
            System.out.printf("%d,", primos[y]);
        }
        System.out.println();
        return primos;
    }
}
