package comportamento.memoria.arrays.listas.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {
    
    public static void main(String[] args) throws Exception{

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Adriano");
        list.add("Anna");
        list.add("Albert");
        list.add(2, "Marco");

        System.out.println("\n--------------");
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("--------------");

        list.remove("Anna");
        list.remove(2);

        System.out.printf("Tamanho da Lista: %d\n",list.size());

        for (String x : list) {
            System.out.println(x);
        }
        list.removeIf(x -> x.charAt(0) == 'M');

        System.out.println("--------------");

        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("----------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Bob: " + list.indexOf("Marco"));
        System.out.println("----------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }
        System.out.println("----------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);

    }
}
