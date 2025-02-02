package generics.curinga.curingas_delimitadores.solucao.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
  public static void main(String[] args) {
    
    cleanScreen();

    // Criação de uma lista de inteiros. 'myInts' contém os valores 1, 2, 3 e 4.
    List<Integer> myInts = Arrays.asList(1, 2, 3, 4);

    // Criação de uma lista de doubles. 'myDoubles' contém os valores 3.14 e 6.28.
    List<Double> myDoubles = Arrays.asList(3.14, 6.28);

    // Criação de uma lista genérica de objetos. 'myObjs' é uma lista do tipo Object.
    // Ela servirá como destino para copiar os elementos das listas 'myInts' e 'myDoubles'.
    List<Object> myObjs = new ArrayList<Object>();

    // Chamada ao método 'copy', passando 'myInts' como origem e 'myObjs' como destino.
    // O método irá copiar os elementos de 'myInts' para 'myObjs'.
    copy(myInts, myObjs);

    System.out.println("Copy de myInts para myObjts: ");
    // Chamada ao método 'printList' para imprimir os elementos de 'myObjs' após a cópia de 'myInts'.
    printList(myObjs);

    // Chamada ao método 'copy', passando 'myDoubles' como origem e 'myObjs' como destino.
    // O método irá copiar os elementos de 'myDoubles' para 'myObjs'.
    copy(myDoubles, myObjs);

    System.out.println("\nCopy de myDoubles para myObjs: ");
    // Chamada ao método 'printList' para imprimir os elementos de 'myObjs' após a cópia de 'myDoubles'.
    printList(myObjs);
  }

  /**
   * @description Copia os elementos de uma lista de números para uma lista de destino.
   * O método permite copiar elementos de qualquer tipo que estenda Number para uma lista
   * que possa conter qualquer tipo que seja uma superclasse de Number.
   * @params source - Lista de números (pode conter tipos como Integer, Double, etc.).
   * @params destiny - Lista de destino que pode conter números ou suas superclasses (como Object).
   */
  public static void copy(List<? extends Number> source, List<? super Number> destiny) {
    for (Number number : source) {
      destiny.add(number); // Adiciona cada elemento de 'source' na lista 'destiny'
    }
  }

  /**
   * @description Imprime os elementos de uma lista de objetos. O método aceita uma lista 
   * de qualquer tipo, usando um wildcard (?).
   * @params list - Lista de objetos de qualquer tipo.
   */
  public static void printList(List<?> list) {
    for (Object obj : list) {
      System.out.print(obj + " "); // Imprime cada elemento seguido de um espaço
    }
    System.out.println(); // Após imprimir todos os elementos, pula para a próxima linha
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
