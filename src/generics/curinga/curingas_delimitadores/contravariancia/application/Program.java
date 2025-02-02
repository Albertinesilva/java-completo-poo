package generics.curinga.curingas_delimitadores.contravariancia.application;

import java.util.ArrayList;
import java.util.List;

public class Program {
  public static void main(String[] args) {
    
    cleanScreen();

    // Criação de uma lista do tipo Object, que é o tipo raiz para todos os objetos em Java.
    List<Object> myObjs = new ArrayList<Object>();
    myObjs.add("Maria"); // Adiciona uma String à lista
    myObjs.add("Alex"); // Adiciona outra String à lista

    // A lista 'myObjs' é atribuída a uma lista do tipo 'List<? super Number>'.
    // O wildcard '? super Number' significa que a lista pode armazenar qualquer
    // tipo que seja superclasse de 'Number'.
    // Isso inclui 'Number' e qualquer classe que seja superclasse de 'Number', como 'Object'.
    // A lista pode armazenar instâncias de 'Number' ou suas subclasses, mas o tipo
    // exato da lista é desconhecido.
    List<? super Number> myNums = myObjs;

    // Adiciona valores à lista 'myNums'.
    // Como 'myNums' é do tipo 'List<? super Number>', podemos adicionar elementos
    // do tipo 'Number' ou suas subclasses.
    // O compilador permite adicionar valores do tipo 'Number' (como 'Integer',
    // 'Double', etc.) ou objetos que são instâncias de 'Number'.
    myNums.add(10); // Adiciona um valor inteiro à lista
    myNums.add(3.14); // Adiciona um valor double à lista

    // Tentativa de ler um valor de 'myNums' e armazená-lo em uma variável do tipo
    // 'Number' resultará em erro de compilação.
    // O problema é que, devido ao wildcard '? super Number', o tipo exato da lista
    // é desconhecido, e o compilador não sabe qual tipo específico
    // de elemento está presente na lista. Portanto, não pode garantir que o valor
    // retornado de 'myNums.get(0)' seja do tipo 'Number'.
    // Number x = myNums.get(0); // Erro de compilação: O compilador não sabe qual
    // tipo será retornado, portanto não pode garantir que seja um 'Number'.

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
