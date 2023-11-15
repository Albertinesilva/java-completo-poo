package aplication;

import java.util.Locale;
import java.util.Scanner;

public class SorveteriaInvernoDoce {

    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        String[] sabores = new String[15];
        double[] precos = new double[15];
        int[] pedidos = new int[15];
        String[] recipientes = new String[4];
        String[] itens = new String[3];
        double[] precosItens = new double[3];

        for (int i = 0; i < sabores.length; i++) {
            sabores[i] = lerSabores(sabores);
        }

        for (int i = 0; i < sabores.length; i++) {
            precos[i] = lerValorSorvete(sabores[i]);
        }

        for (int i = 0; i < pedidos.length; i++) {
            pedidos[i] = lerQuantidadePedido(sabores[i]);
        }

        imprimirSaborMaisVendido(sabores, pedidos);

        int indice = calcularIndiceMaiorFaturamento(precos, pedidos);

        imprimirFaturamentoSabor(pedidos, sabores, indice, precos);

        imprimirRecipienteMaisVendido(recipientes, indice);

        imprimirSaborMaisBarato(sabores, precos);

        imprimirItemMaisCaro(itens, precosItens);

        scan.close();

    }

    public static String lerSabores(String[] sabores) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe o sabor do sorvete: ");
        String sabor = scan.nextLine();

        return sabor;
    }

    public static int lerQuantidadePedido(String sabor) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Informe a quantidade de pedidos para o sabor %s: ", sabor);
        int quantidade = scan.nextInt();

        return quantidade;
    }

    public static double lerValorSorvete(String sabor) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Informe o valor do sorvete de %s: ", sabor);
        double valor = scan.nextDouble();

        return valor;
    }

    public static void imprimirSaborMaisVendido(String[] sabores, int[] pedidos) {
        int maior = 0;
        int indice = 0;
        for (int i = 0; i < pedidos.length; i++) {
            if (pedidos[i] > maior) {
                maior = pedidos[i];
                indice = i;
            }
        }
        System.out.printf("O sabor mais vendido foi %s com %d pedidos.\n", sabores[indice], maior);
    }

    public static int calcularIndiceMaiorFaturamento(double[] precos, int[] quantidade) {
        double maior = 0;
        int indice = 0;
        for (int i = 0; i < precos.length; i++) {
            if (precos[i] * quantidade[i] > maior) {
                maior = precos[i] * quantidade[i];
                indice = i;
            }
        }
        return indice;
    }

    public static void imprimirFaturamentoSabor(int[] quantidade, String[] sabores, int indice, double[] precos) {
        System.out.printf("O sabor %s teve um faturamento de R$%.2f.\n", sabores[indice],
                quantidade[indice] * precos[indice]);
    }

    public static void imprimirRecipienteMaisVendido(String[] recipientes, int indice) {
        System.out.printf("O recipiente mais vendido foi %s.\n", recipientes[indice]);
    }

    public static void imprimirSaborMaisBarato(String[] sabores, double[] precos) {
        double menor = precos[0];
        int indice = 0;
        for (int i = 0; i < precos.length; i++) {
            if (precos[i] < menor) {
                menor = precos[i];
                indice = i;
            }
        }
        System.out.printf("O sabor mais barato foi %s com o valor de R$%.2f.\n", sabores[indice], menor);
    }

    public static void imprimirItemMaisCaro(String[] itens, double[] precos) {
        double maior = precos[0];
        int indice = 0;
        for (int i = 0; i < precos.length; i++) {
            if (precos[i] > maior) {
                maior = precos[i];
                indice = i;
            }
        }
        System.out.printf("O item mais caro foi %s com o valor de R$%.2f.\n", itens[indice], maior);
    }

}
