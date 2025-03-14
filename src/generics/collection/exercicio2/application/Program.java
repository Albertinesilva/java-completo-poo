package generics.collection.exercicio2.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
  public static void main(String[] args) {
    
    cleanScreen();
    Scanner sc = new Scanner(System.in);

    Set<Integer> a = new HashSet<>();
    Set<Integer> b = new HashSet<>();
    Set<Integer> c = new HashSet<>();

    System.out.print("\nHow many students for course A? ");
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      int number = sc.nextInt();
      if (a.contains(number)) {
        cleanScreen();
        System.out.println("This student ID already exists in the collection.");
      } else {
        a.add(number);
        cleanScreen();
        System.out.println("Student ID added successfully.");
      }
    }

    System.out.print("How many students for course B? ");
    n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      int number = sc.nextInt();
      b.add(number);
    }

    System.out.print("How many students for course C? ");
    n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      int number = sc.nextInt();
      c.add(number);
    }

    Set<Integer> total = new HashSet<>(a);
    total.addAll(b);
    total.addAll(c);

    System.out.println("Total students: " + total.size() + "\n");

    sc.close();
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
