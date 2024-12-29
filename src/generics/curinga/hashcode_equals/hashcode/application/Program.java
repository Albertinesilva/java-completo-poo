package generics.curinga.hashcode_equals.hashcode.application;

public class Program {
  public static void main(String[] args) {
    
    limparTela();
    String a = "Maria";
    String b = "Alex";

    System.out.println(a.hashCode());
    System.out.println(b.hashCode());
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
