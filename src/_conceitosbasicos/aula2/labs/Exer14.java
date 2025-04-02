
package _conceitosbasicos.aula2.labs;

import java.util.Scanner;


public class Exer14 {
    
    public static void main(String[] args) {

        cleanScreen();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o tamanho do arquivo: ");
        double tamArquivo = scan.nextDouble();
        
        System.out.println("Entre com a velocidade da internet: ");
        double velInternet = scan.nextDouble();
        
        double tempo = tamArquivo / velInternet;
        
        System.out.println("Tempo de dowload: " + tempo);

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
