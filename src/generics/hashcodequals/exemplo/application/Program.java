package generics.hashcodequals.exemplo.application;

import generics.hashcodequals.exemplo.entities.Client;

public class Program {
  public static void main(String[] args) {
    
    cleanScreen();

    // Criação de três objetos do tipo Client com dados similares e diferentes
    Client c1 = new Client("Maria", "maria@gmail.com");
    Client c2 = new Client("Alex", "alex@gmail.com");
    Client c3 = new Client("Maria", "maria@gmail.com");

    // Comparação de hash codes
    System.out.println("HASHCODE: ");
    System.out.println(c1.hashCode()); // Exibe o hash code do objeto c1
    System.out.println(c2.hashCode()); // Exibe o hash code do objeto c2
    System.out.println(c3.hashCode()); // Exibe o hash code do objeto c3
    System.out.print("----------");

    // Comparação usando o método equals
    System.out.println("\nEQUALS: ");
    System.out.println(c1.equals(c2)); // Compara c1 com c2 (esperado: false)
    System.out.println(c2.equals(c2)); // Compara c2 consigo mesmo (esperado: true)
    System.out.println(c1.equals(c3)); // Compara c1 com c3 (esperado: true se equals estiver bem implementado)
    System.out.print("----------");

    // Comparação de referências de memória (== compara endereços de memória, não conteúdo)
    System.out.println("\nREFERENCIA DE MEMÓRIA:");
    System.out.println(c1 == c2); // Esperado: false, pois c1 e c2 apontam para objetos diferentes
    System.out.println("----------");

    // Comparação entre literais de string
    String s1 = "Test";
    String s2 = "Test";
    System.out.println("TRATAMENTO PARA LITERAIS:");
    System.out.println(s1 == s2); // Esperado: true, pois literais iguais compartilham a mesma referência na pool de strings
    System.out.println("----------");

    // Comparação entre objetos String criados com "new"
    String s3 = new String("Test");
    String s4 = new String("Test");
    System.out.println("TRATAMENTO PARA OBJETO");
    System.out.println(s3 == s4); // Esperado: false, pois objetos criados com "new" possuem referências diferentes

    // Adição de explicações adicionais
    System.out.println("\nEXPLICAÇÃO:");
    System.out.println("1. O método hashCode retorna um código numérico que representa o objeto.");
    System.out.println("2. O método equals compara o conteúdo de dois objetos.");
    System.out.println("3. O operador == compara referências de memória, não o conteúdo dos objetos.");
    System.out.println("4. Strings literais compartilham a mesma referência, enquanto objetos String criados com 'new' não.\n\n");
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
