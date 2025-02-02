package expressoes_lambda.funcoes_recebem_funcoes.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import expressoes_lambda.funcoes_recebem_funcoes.entities.Product;
import expressoes_lambda.funcoes_recebem_funcoes.services.ProductService;

public class Program {

  public static void main(String[] args) {

    cleanScreen();
    Locale.setDefault(Locale.US);
    List<Product> list = new ArrayList<>();

    list.add(new Product("Tv", 900.00));
    list.add(new Product("Mouse", 50.00));
    list.add(new Product("Tablet", 350.50));
    list.add(new Product("HD Case", 80.90));

    ProductService ps = new ProductService();

    // Compara diretamente o primeiro caractere do nome com 'm'.
    // Funciona apenas se o caractere for exatamente 'm' (minúsculo).
    // Não considera letras maiúsculas ('M').
    double sum1 = ps.filteredSum(list, p -> p.getName().charAt(0) == 'M');

    // Converte o primeiro caractere do nome para minúsculo antes de comparar com 'm'.
    // Assim, aceita tanto 'm' quanto 'M' porque 'M' será convertido para 'm'.
    // É uma abordagem eficiente para casos onde há necessidade de ignorar a diferença de maiúsculas e minúsculas.
    double sum2 = ps.filteredSum(list, p -> Character.toLowerCase(p.getName().charAt(0)) == 'm');

    // Converte o primeiro caractere do nome para maiúsculo antes de comparar com 'M'.
    // Assim, aceita tanto 'm' quanto 'M' porque 'm' será convertido para 'M'.
    // Tem o mesmo efeito da solução anterior, mas padroniza para maiúsculas em vez de minúsculas.
    double sum3 = ps.filteredSum(list, p -> Character.toUpperCase(p.getName().charAt(0)) == 'M');

    // Converte o primeiro caractere do nome para uma string e usa equalsIgnoreCase para comparar com "m".
    // Essa abordagem verifica a igualdade de strings sem diferenciar maiúsculas e minúsculas.
    // Funciona bem, mas é menos eficiente que as outras soluções, já que cria uma nova string a partir do caractere.
    double sum = ps.filteredSum(list, p -> String.valueOf(p.getName().charAt(0)).equalsIgnoreCase("m"));

    double sum4 = ps.filteredSum(list, p -> p.getPrice() < 100.0);

    System.out.println("Sum names that start with the letter T = " + String.format("%.2f", sum1));

    System.out.println("Sum precos < 100.0 = " + String.format("%.2f", sum4));

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
