package manipulando_data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ConvertendoData {

  public static void main(String[] args) {

    LocalDate data2 = LocalDate.parse("2023-11-14");
    LocalDateTime data3 = LocalDateTime.parse("2023-11-14T13:30:10");
    Instant instante2 = Instant.parse("2023-11-14T00:30:10Z");

    // Dessa forma o objeto pode ser aproveitado em outras partes do código
    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
    // DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
    DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

    cleanScreen();
    System.out.println("\n\t============= Convertendo data-hora para texto =============");

    // Três formas de fazer a mesma coisa:
    System.out.println("\n\tData2: " + data2.format(fmt1));
    System.out.println("\tData2: " + fmt1.format(data2));
    System.out.println("\tData2: " + data2.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

    System.out.println("\tData3: " + data3.format(fmt2));
    System.out.println("\tInstante2: " + fmt3.format(instante2));
    System.out.println("\tData2: " + fmt5.format(instante2));
    // Outra forma de fazer:
    System.out.println("\tData2: " + instante2.toString());
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
