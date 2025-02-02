package manipulando_data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Scanner;
// import java.time.ZoneId;

class ConvertendoDataHoraGlobal {
  public static void main(String[] args) {

    LocalDate data2 = LocalDate.parse("2023-11-14");
    LocalDateTime data3 = LocalDateTime.parse("2023-11-14T13:30:10");
    Instant instante = Instant.parse("2023-11-15T01:30:10Z");

    // for(String s : ZoneId.getAvailableZoneIds()) {
    // System.out.println(s);
    // }

    LocalDate r1 = LocalDate.ofInstant(instante, ZoneId.systemDefault());
    LocalDate r2 = LocalDate.ofInstant(instante, ZoneId.of("Portugal"));
    LocalDateTime r3 = LocalDateTime.ofInstant(instante, ZoneId.systemDefault());
    LocalDateTime r4 = LocalDateTime.ofInstant(instante, ZoneId.of("Portugal"));
    
    cleanScreen();
    System.out.println("\t=== Convertendo Data/Hora Global Para Local ===\n");
    System.out.println("\tr1 = " + r1);
    System.out.println("\tr2 = " + r2);
    System.out.println("\tr3 = " + r3);
    System.out.println("\tr4 = " + r4);

    System.out.println("\tdata2: " + data2.getDayOfMonth() + "/" + data2.getMonthValue() + "/" + data2.getYear());

    System.out.println("\tdata3: " + data3.getDayOfMonth() + "/" 
                                   + data3.getMonthValue() + "/" 
                                   + data3.getYear() + " " 
                                   + data3.getHour() + ":" 
                                   + data3.getMinute() + ":" 
                                   + data3.getSecond());
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

  public static void pausa(Scanner scan) {
    System.out.print("\n\tPressione ENTER para continuar...");
    scan.nextLine();
  }
}
