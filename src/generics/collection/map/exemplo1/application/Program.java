package generics.collection.map.exemplo1.application;

import java.util.Map;
import java.util.TreeMap;

public class Program {
  public static void main(String[] args) {
    
    cleanScreen();
    Map<String, String> cookies = new TreeMap<>();

    cookies.put("username", "maria");
    cookies.put("email", "maria@gmail.com");
    cookies.put("phone", "99771122");

    cookies.remove("email");

    cookies.put("phone", "99771133");

    System.out.println("\nContains 'phone' key: " + cookies.containsKey("phone"));
    System.out.println("Phone number: " + cookies.get("phone"));
    System.out.println("Email: " + cookies.get("email"));
    System.out.println("Size: " + cookies.size());

    System.out.println("\nALL COOKIES:");
    for (String key : cookies.keySet()) {
      System.out.println(key + ": " + cookies.get(key));
    }
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
