package listas.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class FuncionariosRun {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.printf("\nHou many employees will be registered? ");
        int N = scan.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.printf("\nEmplyoee #" + (i + 1) + ":");
            System.out.printf("\nId: ");
            Integer id = scan.nextInt();

            while (hasId(list, id)) {
                System.out.printf("Id already taken! Try again: ");
                id = scan.nextInt();
            }

            System.out.printf("Name: ");
            scan.nextLine();
            String name = scan.nextLine();            
            System.out.printf("Salary: ");
            double salary = scan.nextDouble();

            Employee emp = new Employee(id, name, salary);
            list.add(emp);

        }
        System.out.printf("\nEnter the employee id that will have salary increase : ");
        int idSalary = scan.nextInt();

        Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);

        if (emp == null) {
            System.out.printf("This id does not exist!\n");
        } else {
            System.out.printf("Enter the percentage: ");
            double percentage = scan.nextDouble();
            emp.increaseSalary(percentage);
        }

        // Dessa forma, estou pegando a possição da lista para fazer a verificação.
        // if (position(list, idSalary) == null) {
        // System.out.printf("This id does not exist!\n");
        // } else {
        // System.out.printf("Enter the percentage: ");
        // double percentage = scan.nextDouble();
        // list.get(position(list, idSalary)).increaseSalary(percentage);
        // }

        System.out.printf("\nList of employee:\n");
        for (Employee e : list) {
            System.out.println(e);
        }

        scan.close();
    }

    // public static Integer position(List<Employee> list, int id) {

    //     for (int i = 0; i < list.size(); i++) {

    //         if (list.get(i).getId() == id) {
    //             return i;
    //         }
    //     }
    //     return null;
    // }

    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }

}
