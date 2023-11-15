package vetores.exercicio.alturas;

import java.util.Locale;
import java.util.Scanner;

public class AlturaRun {
    
    public static void main(String[] args) throws Exception{

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.printf("Quantas pessoas serao digitadas? ");
        int n = scan.nextInt();
        Alturas[] alturas = new Alturas[n];
        
        double soma = 0.0;
        for(int i = 0; i < alturas.length; i++){
            scan.nextLine();
            System.out.printf("\nDados da %da pessoa:", i + 1);
            System.out.printf("\nNome: ");
            String name = scan.nextLine();
            System.out.printf("Idade: ");
            int idade = scan.nextInt();
            System.out.printf("Altura: ");
            double altura = scan.nextDouble();

            alturas[i] = new Alturas(name, idade, altura);
            soma += alturas[i].getAltura();
        }
        double mediaAlturas = soma / n;
        System.out.printf("\nAltura Média: %.2f", mediaAlturas);

        int cont = 0;
        for(int y = 0; y < alturas.length; y++){
        
            if(alturas[y].getIdade() < 16){
                cont++;
            }
        }
        double percent = cont * 100.0 / n;
        System.out.printf("\nPessoas com menos de 16 anos: %.1f%%", percent);

        for(int y = 0; y < alturas.length; y++){
            if(alturas[y].getIdade() < 16){
                System.out.printf("\nNome: %s\n",alturas[y].getName());
            }
        }

        scan.close();

    }
}
