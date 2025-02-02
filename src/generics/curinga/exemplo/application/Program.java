package generics.curinga.exemplo.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
  public static void main(String[] args) {
    
    cleanScreen();
    @SuppressWarnings("unused")// Suprime o aviso de compilação
    // List<Object> não é o supertipo de qualquer tipo de lista:
    List<Object> myObjs = new ArrayList<Object>();
    List<Integer> myNumbers = new ArrayList<Integer>();

    // Não compila, pois List<Object> não é o supertipo de List<Integer>:
    // myObjs = myNumbers; // erro de compilação

    @SuppressWarnings("unused")
    // O supertipo de qualquer tipo de lista é List<?>. Este é um tipo curinga:
    List<?> myObjs2 = new ArrayList<Object>();
    @SuppressWarnings("unused")
    List<Integer> myNumbers2 = new ArrayList<Integer>();

    // Atribuição permitida, pois List<?> pode ser atribuído a qualquer tipo de
    // lista:
    myObjs2 = myNumbers;

    // Lista de inteiros
    List<Integer> myInts = Arrays.asList(5, 2, 10);
    printList(myInts); // Imprime os elementos da lista de inteiros

    // Lista de strings
    List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
    printList(myStrs); // Imprime os elementos da lista de strings

    @SuppressWarnings("unused")
    // List<?> não é permitido adicionar elementos:
    List<?> list = new ArrayList<Integer>();
    // list.add(3); // erro de compilação - Não é permitido adicionar elementos em
    // List<?>
  }

  /**
  * @description Este método imprime os elementos de uma lista de qualquer tipo (List<?>).
  * Ele utiliza um loop para iterar e imprimir cada elemento da lista.
  * 
  * @param list A lista de elementos a ser impressa. Pode ser qualquer tipo de lista.
  */
  public static void printList(List<?> list) {
    for (Object obj : list) {
      System.out.println(obj);
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
