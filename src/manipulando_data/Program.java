package manipulando_data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {

  public static void main(String[] args) {

    cleanScreen();

    // DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");


    LocalDate data = LocalDate.now();
    LocalDateTime dataHora = LocalDateTime.now();
    Instant instante = Instant.now();

    LocalDate data2 = LocalDate.parse("2023-11-14");
    LocalDateTime data3 = LocalDateTime.parse("2023-11-14T13:30:10");
    Instant instante2 = Instant.parse("2023-11-14T13:30:10Z");
    Instant instante3 = Instant.parse("2023-11-14T13:30:10-03:00");

    // Outra forma de fazer: LocalDate date4 = LocalDate.parse("14/11/2023", fmt1);
    LocalDate date4 = LocalDate.parse("14/11/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy")); 
    LocalDateTime date5 = LocalDateTime.parse("14/11/2023 13:30:10", fmt2);

    LocalDate date6 = LocalDate.of(2023, 11, 14);
    LocalDateTime date7 = LocalDateTime.of(2023, 11, 14, 13, 30, 10);

    limparTela();
    System.out.println("\n\t============= Manipulando Datas:ISO 8601 =============\n");
    System.out.println("\tData atual: " + data);
    System.out.println("\tData e hora atual: " + dataHora);
    System.out.println("\tInstante atual: " + instante);
    System.out.println("\tData2: " + data2);
    System.out.println("\tData3: " + data3);
    System.out.println("\tInstante2: " + instante2);
    System.out.println("\tInstante3: " + instante3);
    System.out.println("\tDate4: " + date4);
    System.out.println("\tDate5: " + date5);
    System.out.println("\tDate6: " + date6);
    System.out.println("\tDate7: " + date7);
    System.out.println("\t=====================================================\n");
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

  public static void pausa(Scanner scan) {
    System.out.print("\n\tPressione ENTER para continuar...");
    scan.nextLine();
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
