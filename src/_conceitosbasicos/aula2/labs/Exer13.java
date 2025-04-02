
package _conceitosbasicos.aula2.labs;

import java.util.Scanner;

public class Exer13 {

    public static void main(String[] args) {

        cleanScreen();
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o valor hora: ");
        double valorHora = scan.nextDouble();

        System.out.println("Entre com a quantidade de horas trabalhadas no mês: ");
        double horas = scan.nextDouble();

        double salarioBruto = valorHora * horas;
        double inss = (salarioBruto / 100) * 8;
        double sindicato = (salarioBruto / 100) * 5;
        double impostoDeRenda = (salarioBruto / 100) * 11;

        double totalDescontos = inss + sindicato + impostoDeRenda;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Sálario bruto: " + salarioBruto);
        System.out.println("INSS: " + inss);
        System.out.println("SINDICATO: " + sindicato);
        System.out.println("IMPOSTO DE RENDA: " + impostoDeRenda);
        System.out.println("TOTAL DE DECONTOS: " + totalDescontos);
        System.out.println("SALÁRIO LIQUIDO: " + salarioLiquido);

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
