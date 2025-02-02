package funcoes.sintaxe;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        cleanScreen();
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe os Números: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println("Maior Número: " + maiorNumero(a, b, c));

        scan.close();

    }

    public static int maiorNumero(int x, int y, int z) {

        if (x > y && x > z) {
            return x;

        } else if (y > z) {
            return y;

        } else {
            return z;
        }
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
