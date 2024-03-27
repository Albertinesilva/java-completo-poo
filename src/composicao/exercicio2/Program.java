package composicao.exercicio2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {

  public static void main(String[] args) throws ParseException {

    limparTela();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    Comment c1 = new Comment("Have a nice trip!");
    Comment c2 = new Comment("Wow that's awesome!");

    Post p1 = new Post(
        sdf.parse("21/06/2018 13:05:44"),
        "Traveling to New Zealand",
        "I'm going to visit this wonderful country!",
        12);
    p1.addComment(c1);
    p1.addComment(c2);

    Comment c3 = new Comment("Good night");
    Comment c4 = new Comment("May the Force be with you");

    Post p2 = new Post(
        java.sql.Timestamp.valueOf("2018-03-28 23:14:19"),
        "Good night guys",
        "See you tomorrow",
        5);
    p2.addComment(c3);
    p2.addComment(c4);

    System.out.println(p1);
    System.out.println(p2);
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
