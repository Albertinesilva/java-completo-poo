package string;

public class App {
    public static void main(String[] args) throws Exception {

        cleanScreen();
        System.out.println("FUNÇOES COM STRING");
        String original = "abcde FGHIJ ABC abc DEFG  ";

        String minusculas = original.toLowerCase();
        String maiusculas = original.toUpperCase();
        String espacosNoCanto = original.trim();
        String retiraCaractere = original.substring(2);
        String retiraCaractereLimitando = original.substring(2, 9);
        String substituiCaractere = original.replace('a', 'x');
        String substituiString = original.replace("abc", "xy");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        // Pega as partes da String e atribui no vetor, recortadas coforme o indicado no
        // Split.
        String s = "potato apple lemon";
        String[] vect = s.split(" ");

        System.out.println("\nOriginal: -" + original + "-");
        System.out.println("toLowerCase: -" + minusculas + "-");
        System.out.println("toUpperCase: -" + maiusculas + "-");
        System.out.println("trim: -" + espacosNoCanto + "-");
        System.out.println("substring(2): -" + retiraCaractere + "-");
        System.out.println("substring(2, 9): -" + retiraCaractereLimitando + "-");
        System.out.println("replace('a', 'x'): -" + substituiCaractere + "-");
        System.out.println("replace('abc', 'xy'): -" + substituiString + "-");
        System.out.println("Pega a 1º ocorrencia(Posição): IndexOf('bc'): " + i);
        System.out.println("Pega a ultima ocorrencia(Posição): LastIndexOf('bc'): " + j + "\n");

        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2] + "\n");

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
