package aplication.peixaria;

import java.util.Locale;
import java.util.Scanner;

public class Peixaria {

    public static void main(String[] args) throws Exception {

        cleanScreen();
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        String[][] mat = new String[10][2];
        String[][] zona = new String[5][2];

        for (int l = 0; l < mat.length; l++) {
            mat[l][0] = lerNomePeixe();
            mat[l][1] = lerPrecoPeixe();
            for (int c = 0; c < mat[l].length; c++) {
                mat[l][0] = lerNomePeixe();
                mat[l][1] = lerPrecoPeixe();
            }

        }

        for (int l = 0; l < mat.length; l++) {
            for (int c = 0; c < mat[l].length; c++) {
                System.out.printf("|%s", mat[l][c]);
            }
            System.out.printf("|\n");
        }

        for (int l = 0; l < zona.length; l++) {
            for (int c = 0; c < zona[l].length; c++) {
                zona[l][c] = lerNomeZona();
            }

        }
        String nomeZona = zona[0][0];
        lerPrecoZona(nomeZona);

        double custoPedido = 0;
        double taxaEntrega = 0;
        double valorPedido = 0;
        int[] quantidadePedido = new int[10];
        String[] nomePeixes = new String[10];

        for (int i = 0; i < nomePeixes.length; i++) {
            nomePeixes[i] = mat[i][0];
        }

        quantidadePedido = lerQuantidadePedido(nomePeixes);
        for (int i = 0; i < quantidadePedido.length; i++) {
            custoPedido += quantidadePedido[i] * Double.parseDouble(mat[i][1]);
        }

        System.out.printf("Custo do pedido: R$ %.2f\n", custoPedido);
        taxaEntrega = Double.parseDouble(lerPedido(nomeZona));
        valorPedido = custoPedido + taxaEntrega;
        System.out.printf("Valor do pedido: R$ %.2f\n", valorPedido);

        scan.close();
    }

    public static String lerNomePeixe() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o nome do peixe: ");
        String nomePeixe = scan.nextLine();
        scan.close();
        return nomePeixe;
    }

    public static String lerPrecoPeixe() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o preço por quilo do peixe: ");
        String precoPeixe = scan.nextLine();
        scan.close();
        return precoPeixe;
    }

    public static String lerNomeZona() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o nome da zona: ");
        String nomeZona = scan.nextLine();
        scan.close();
        return nomeZona;
    }

    public static String lerPrecoZona(String nomeZona) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o preço da zona: ");
        String precoZona = scan.nextLine();
        scan.close();
        return precoZona;
    }

    public static String lerPedido(String zona) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o preço da zona: ");
        String precoZona = scan.nextLine();
        scan.close();
        return precoZona;
    }

    public static String lerQuantidadePeixe(String nomePeixe) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de peixe: ");
        String quantidadePeixe = scan.nextLine();
        scan.close();
        return quantidadePeixe;
    }

    public static String lerQuantidadeZona(String nomeZona) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de peixe: ");
        String quantidadeZona = scan.nextLine();
        scan.close();
        return quantidadeZona;
    }

    public static int[] lerQuantidadePedido(String[] nomePeixes) {
        Scanner scan = new Scanner(System.in);
        int[] quantidadePedido = new int[10];
        for (int i = 0; i < nomePeixes.length; i++) {
            System.out.printf("Digite a quantidade de %s: ", nomePeixes[i]);
            quantidadePedido[i] = scan.nextInt();
        }
        scan.close();
        return quantidadePedido;
    }

    public static int lerZona(String[][] zona) {
        Scanner scan = new Scanner(System.in);
        int codigoZona = 0;
        for (int i = 0; i < zona.length; i++) {
            System.out.printf("Digite o código da zona: ");
            codigoZona = scan.nextInt();
        }
        scan.close();
        return codigoZona;
    }

    public static int lerZonaPedido(String[] nomesZonas) {
        Scanner scan = new Scanner(System.in);
        int codigoZona = 0;
        for (int i = 0; i < nomesZonas.length; i++) {
            System.out.printf("Digite o código da zona: ");
            codigoZona = scan.nextInt();
        }
        scan.close();
        return codigoZona;
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
