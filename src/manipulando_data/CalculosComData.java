package manipulando_data;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class CalculosComData {

  public static void main(String[] ars) {

    LocalDate data2 = LocalDate.parse("2023-11-14");
    LocalDateTime data3 = LocalDateTime.parse("2023-11-14T13:30:10");
    Instant instant = Instant.parse("2023-11-14T00:30:10Z");

    cleanScreen();
    System.out.println("\n\t============= Calculos com data =============");

    // Calculos com data-hora soma e subtração de dias, meses e anos (com
    // LocalDate).
    LocalDate pastWeekLocalDate = data2.minusDays(7);
    LocalDate nextWeekLocalDate = data2.plusDays(7);
    LocalDate nextWeekLocalDate2 = data2.plusYears(1);

    System.out.println("\n\tpastWeekLocalDate: " + pastWeekLocalDate);
    System.out.println("\tnextWeekLocalDate: " + nextWeekLocalDate);
    System.out.println("\tnextWeekLocalDate2: " + nextWeekLocalDate2);

    System.out.println("\n\t============= Calculos com hora =============");

    LocalDateTime pastWeekLocalDateTime = data3.minusDays(7);
    LocalDateTime nextWeekLocalDateTime = data3.plusDays(7).plusHours(7);

    System.out.println("\n\tpastWeekLocalDateTime: " + pastWeekLocalDateTime);
    System.out.println("\tnextWeekLocalDateTime: " + nextWeekLocalDateTime);

    System.out.println("\n\t============= Calculos com Instant =============");

    Instant pastWeeInstant = instant.minus(7, ChronoUnit.DAYS);
    Instant nextWeekInstant = instant.plus(7, ChronoUnit.DAYS);

    System.out.println("\n\tpastWeeInstant: " + pastWeeInstant);
    System.out.println("\tnextWeekInstant: " + nextWeekInstant);

    System.out.println("\n\t============= Calculos com Duration =============");

    Duration duration1 = Duration.between(pastWeekLocalDate.atStartOfDay(), data2.atStartOfDay());
    Duration duration2 = Duration.between(pastWeekLocalDateTime, data3);
    Duration duration3 = Duration.between(pastWeeInstant, instant);
    Duration duration4 = Duration.between(instant, pastWeeInstant);

    System.out.println("\n\tDuration1: " + duration1.toDays() + " dias");
    System.out.println("\tDuration2: " + duration2.toDays() + " dias");
    System.out.println("\tDuration3: " + duration3.toDays() + " dias");
    System.out.println("\tDuration4: " + duration4.toDays() + " dias");

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
