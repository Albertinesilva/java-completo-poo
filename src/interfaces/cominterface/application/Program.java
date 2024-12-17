package interfaces.cominterface.application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import interfaces.seminterface.models.CarRental;
import interfaces.seminterface.models.Vehicle;
import interfaces.seminterface.services.BrazilTaxService;
import interfaces.seminterface.services.RentalService;

public class Program {

  public static void main(String[] args) {
    limparTela();
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    System.out.println("Entre com os dados do aluguel");
    System.out.println("Modelo do carro: ");
    String carModel = sc.nextLine();
    System.out.println("Data e hora de início (dd/MM/yyyy HH:mm): ");
    LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
    System.out.println("Data e hora de término (dd/MM/yyyy HH:mm): ");
    LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

    CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

    System.out.print("Entre com o preço por hora: ");
    double pricePerHour = sc.nextDouble();
    System.out.print("Entre com o preço por dia: ");
    double pricePerDay = sc.nextDouble();

    BrazilTaxService taxService = new BrazilTaxService();
    RentalService rentalService = new RentalService(pricePerHour, pricePerDay, taxService);

    rentalService.processInvoice(cr);

    System.out.println("FATURA:");
    System.out.println("Pagamento básico: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
    System.out.println("IMPOSTO: ");
    System.out.println("Taxa: " + String.format("%.2f", cr.getInvoice().getTax()));
    System.out.println("Pagamento total: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));

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
