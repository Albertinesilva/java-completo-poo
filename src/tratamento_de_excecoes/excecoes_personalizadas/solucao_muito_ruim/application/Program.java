package tratamento_de_excecoes.excecoes_personalizadas.solucao_muito_ruim.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import tratamento_de_excecoes.excecoes_personalizadas.model.entities.Reservation;

public class Program {

  public static void main(String[] args) throws ParseException {

    cleanScreen();
    Scanner scan = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    System.out.print("Room number: ");
    int number = scan.nextInt();

    System.out.print("Check-in date (dd/MM/yyyy): ");
    Date checkIn = sdf.parse(scan.next());

    System.out.print("Check-out date (dd/MM/yyyy): ");
    Date checkOut = sdf.parse(scan.next());

    if (!checkOut.after(checkIn)) {
      System.out.println("Error in reservation: Check-out date must be after check-in date \n");

    } else {
      Reservation reservation = new Reservation(1, number, checkIn, checkOut);
      System.out.println("Reservation: " + reservation);

      System.out.println("Enter data to update the reservation: ");

      System.out.print("Check-in date (dd/MM/yyyy): ");
      checkIn = sdf.parse(scan.next());

      System.out.print("Check-out date (dd/MM/yyyy): ");
      checkOut = sdf.parse(scan.next());

      Date now = new Date();
      if (checkIn.before(now) || checkOut.before(now)) {
        System.out.println("Error in reservation: Reservation dates for update must be future dates");

      } else if (!checkOut.after(checkIn)) {
        System.out.println("Error in reservation: Check-out date must be after check-in date \n");
        
      } else {
        reservation.updateDates(checkIn, checkOut);
        System.out.println("Reservation: " + reservation);
      }
    }

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
