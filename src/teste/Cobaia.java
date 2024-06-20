package teste;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cobaia {
  public static void main(String[] args) throws ParseException {

    limparTela();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    Date checkIn = sdf.parse("20/06/2024");

    Date checkOut = sdf.parse("21/06/2024");

    if (checkOut.after(checkIn)) {
      System.out.println("CheckOut: " + checkOut);
      
    } else {
      System.out.println("CheckIn: " + checkIn);
    }

    Date now = new Date();
    if (checkIn.before(now) || checkOut.before(now)) {
      System.out.println("Reservation dates for update must be future dates: " + checkIn + ", " + checkOut + ", " + now);
    }
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
