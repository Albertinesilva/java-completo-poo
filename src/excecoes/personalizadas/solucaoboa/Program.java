package excecoes.personalizadas.solucaoboa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import excecoes.personalizadas.model.entities.Reservation;

public class Program {

  public static void main(String[] args) {

    cleanScreen();
    Scanner scan = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    try {
      System.out.print("Room number: ");
      int number = scan.nextInt();
      System.out.print("Check-in date (dd/MM/yyyy): ");
      Date checkIn = sdf.parse(scan.next());
      System.out.print("Check-out date (dd/MM/yyyy): ");
      Date checkOut = sdf.parse(scan.next());

      Reservation reservation = new Reservation(1, number, checkIn, checkOut);
      System.out.println("Reservation: " + reservation);

      System.out.println("Enter data to update the reservation: ");
      System.out.print("Check-in date (dd/MM/yyyy): ");
      checkIn = sdf.parse(scan.next());
      System.out.print("Check-out date (dd/MM/yyyy): ");
      checkOut = sdf.parse(scan.next());

      reservation.updateDates3(checkIn, checkOut);
      System.out.println("Reservation: " + reservation);

    } 
    catch (ParseException e) {
      System.out.println("Invalid date format");
    } 
    catch (IllegalArgumentException e) {
      System.out.println("Error in reservation: " + e.getMessage());
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
