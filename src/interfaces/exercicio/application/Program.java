package interfaces.exercicio.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import interfaces.exercicio.entities.Contract;
import interfaces.exercicio.entities.Installment;
import interfaces.exercicio.services.ContractService;

public class Program {

  public static void main(String[] args) {
    limparTela();
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    System.out.println("Entre com os dados do contrato:");
    System.out.print("Número: ");
    int number = sc.nextInt();
    System.out.print("Data (dd/MM/yyyy): ");
    LocalDate date = LocalDate.parse(sc.next(), fmt);
    System.out.print("Valor contrato: ");
    double totalValue = sc.nextDouble();

    Contract obj = new Contract(number, date, totalValue);

    System.out.print("\nEntre com o número de parcelas: ");
    int numParcelas = sc.nextInt();

    ContractService contractService = new ContractService(null);

    contractService.processContract(obj, numParcelas);

    System.out.println("Parcelas: ");
    for (Installment installment : obj.getInstallments()) {
      System.out.println(installment);
    }

    sc.close();
  }

  public static void limparTela() {
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
