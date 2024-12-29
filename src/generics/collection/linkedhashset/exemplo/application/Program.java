package generics.collection.linkedhashset.exemplo.application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {
  public static void main(String[] args) {
    limparTela();
    // Criando um conjunto (Set) do tipo LinkedHashSet
    // O LinkedHashSet mantém a ordem de inserção dos elementos
    Set<String> set = new LinkedHashSet<>();

    // Adicionando elementos ao conjunto
    set.add("TV");
    set.add("Tablet");
    set.add("Notebook");
    set.add("Ar-condicionado");

    // Verificando se o conjunto contém um elemento específico
    System.out.println("O conjunto contém 'Notebook'? " + set.contains("Notebook")); // Esperado: true

    // Iterando sobre os elementos do conjunto
    System.out.println("\nElementos no conjunto:");
    for (String item : set) {
      System.out.println(item);
    }

    // Adicionando mais exemplos
    // Tentativa de adicionar elementos duplicados (não serão adicionados)
    System.out.println("\nTentando adicionar elementos duplicados...");
    set.add("TV"); // Já existe no conjunto
    set.add("Notebook"); // Já existe no conjunto

    // Exibindo o conjunto novamente para mostrar que elementos duplicados não foram adicionados
    System.out.println("\nElementos após tentativa de duplicação:");
    for (String item : set) {
      System.out.println(item);
    }

    // Removendo um elemento do conjunto
    System.out.println("\nRemovendo o elemento 'Tablet'...");
    set.remove("Tablet");

    // Exibindo os elementos após a remoção
    System.out.println("\nElementos após a remoção:");
    for (String item : set) {
      System.out.println(item);
    }

    // Exemplo de conjunto vazio
    System.out.println("\nLimpando o conjunto...");
    set.clear();
    System.out.println("O conjunto está vazio? " + set.isEmpty()); // Esperado: true

    // Adicionando novamente elementos ao conjunto
    System.out.println("\nAdicionando novos elementos ao conjunto:");
    set.add("Smartphone");
    set.add("Fone de ouvido");
    set.add("Carregador portátil");

    // Exibindo os novos elementos
    System.out.println("\nElementos atuais no conjunto:");
    for (String item : set) {
      System.out.println(item);
    }

    // Explicação adicional sobre LinkedHashSet
    System.out.println("\nEXPLICAÇÃO:");
    System.out.println("1. O LinkedHashSet é uma implementação de Set que mantém a ordem de inserção dos elementos.");
    System.out.println("2. Elementos duplicados não são permitidos em um Set.");
    System.out.println("3. O método contains verifica se um elemento está presente no conjunto.");
    System.out.println("4. O método remove remove um elemento específico.");
    System.out.println("5. O método clear limpa todos os elementos do conjunto.\n\n");
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
