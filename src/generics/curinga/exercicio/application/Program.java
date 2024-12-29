package generics.curinga.exercicio.application;

import java.util.ArrayList;
import java.util.List;

import generics.curinga.exercicio.entities.Circle;
import generics.curinga.exercicio.entities.Retangle;
import generics.curinga.exercicio.entities.Shape;

public class Program {
  public static void main(String[] args) {
    limparTela();

    List<Shape> myShapes = new ArrayList<>();
    // @description Armazenando instâncias de classes concretas (Retangle e Circle) em uma lista
    // do tipo List<Shape>. Isso permite que você trate todos esses objetos de forma polimórfica,
    // ou seja, como objetos do tipo Shape.
    myShapes.add(new Retangle(3.0, 2.0));
    myShapes.add(new Circle(2.0));

    // @description Exibe a soma das áreas de todos os objetos na lista de formas
    System.out.println("Shape areas somadas entre Retangle e Circle:");
    System.out.println("Total area: " + totalAreaList(myShapes));

    // @description Exibe as áreas de cada objeto individualmente
    System.out.println("\nShape areas:");
    System.out.println("Total area: " + totalArea(myShapes.get(0))); // @params shape - Primeiro objeto da lista (Retangle)
    System.out.println("Total area: " + totalArea(myShapes.get(1))); // @params shape - Segundo objeto da lista (Circle)

    // @description Exemplo de uso de curingas (wildcards) com o método totalAreaList
    List<Circle> myCircles = new ArrayList<>();
    myCircles.add(new Circle(2.0));
    myCircles.add(new Circle(3.0));

    System.out.println("Total area do Circle: " + totalAreaList(myCircles));
  }

  /**
  * @description Calcula a soma das áreas de todos os objetos do tipo Shape ou de tipos que implementam essa interface em uma lista.
  * Utiliza o wildcard `? extends Shape`, que permite que a lista contenha qualquer tipo que implemente a 
  * interface `Shape` (ou a própria `Shape`). O wildcard `?` é um curinga que indica que o tipo exato é 
  * desconhecido, mas pode ser qualquer tipo que implemente a interface `Shape`, permitindo flexibilidade no 
  * tipo de objetos que podem ser passados para o método.
  * 
  * @params list - Lista de objetos do tipo `Shape` ou de tipos que implementam a interface `Shape` (por exemplo, `Circle`, `Rectangle`, etc.).
  * @return A soma das áreas de todos os objetos na lista.
  */
  public static double totalAreaList(List<? extends Shape> list) {
    double sum = 0.0;
    // @description Itera sobre a lista de formas e soma suas áreas
    for (Shape s : list) {
      sum += s.area();
    }
    return sum;
  }

  /**
   * @description Calcula a área de um único objeto do tipo Shape.
   * @params shape - Objeto do tipo Shape (pode ser uma instância de Retangle, Circle, etc.)
   * @return A área do objeto passado como parâmetro.
   */
  public static double totalArea(Shape shape) {
    // @description Chama o método area() do objeto Shape para calcular sua área
    return shape.area();
  }

  /**
   * @description Limpa a tela do console, dependendo do sistema operacional.
   * @params Nenhum.
   * @return Nenhum.
   */
  public static void limparTela() {
    try {
      final String os = System.getProperty("os.name");

      if (os.contains("Windows")) {
        // @description Para Windows, usa o comando "cls" para limpar a tela
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
      } else {
        // @description Para sistemas baseados em Unix (Linux, macOS), usa uma sequência
        // de escape para limpar a tela
        System.out.print("\033[H\033[2J");
        System.out.flush();
      }
    } catch (final Exception e) {
      // @description Trata exceções, caso ocorra algum erro ao tentar limpar a tela
      e.printStackTrace();
    }
  }
}
