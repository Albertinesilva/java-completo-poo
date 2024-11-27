package interfaces.seminterface.application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import interfaces.seminterface.models.CarRental;
import interfaces.seminterface.models.Vehicle;

public class Program {

  public static void main(String[] args) {
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
