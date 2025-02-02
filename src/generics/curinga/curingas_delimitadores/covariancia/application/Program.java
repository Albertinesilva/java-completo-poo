package generics.curinga.curingas_delimitadores.covariancia.application;

import java.util.ArrayList;
import java.util.List;

public class Program {
  public static void main(String[] args) {
    
    cleanScreen();

    // Criação de uma lista do tipo Integer, que é uma subclasse de Number.
    List<Integer> intList = new ArrayList<Integer>();
    intList.add(10); // Adiciona o valor 10 à lista
    intList.add(5); // Adiciona o valor 5 à lista

    // A lista 'intList' é atribuída a uma lista do tipo 'List<? extends Number>'.
    // O wildcard '? extends Number' significa que a lista pode ser de qualquer tipo
    // que seja uma subclasse de 'Number' (como Integer, Double, etc.).
    List<? extends Number> list = intList;

    // A variável 'x' pode receber qualquer valor de 'list', pois a lista contém
    // objetos do tipo 'Number' ou suas subclasses.
    // Como 'Integer' é uma subclasse de 'Number', podemos armazenar o valor de
    // 'list.get(0)' em uma variável do tipo 'Number'.
    Number x = list.get(0);

    // Tentativa de adicionar um valor à lista resultará em erro de compilação,
    // pois com o wildcard '? extends Number', não podemos adicionar elementos à lista.
    // O tipo exato da lista é desconhecido e, portanto, não sabemos qual tipo de
    // objeto pode ser adicionado.
    // list.add(20); // Erro de compilação: Não é permitido adicionar elementos em
    // uma lista com '? extends'.
    // O compilador não sabe qual tipo de número será aceito, então a adição é proibida.

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
