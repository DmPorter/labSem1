package lab3.ex14;

import lab3.Employee;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Bill", 1000),
                new Employee("Nick", 3000),
                new Employee("Bob", 3000)
        };
        sortDec(employees);
        System.out.println(Arrays.toString(employees));
        sortInc(employees);
        System.out.println(Arrays.toString(employees));
    }

    public static void sortDec(Employee[] employees){
        Arrays.sort(employees, Comparator.comparing(Employee::getSalary).reversed().thenComparing(Employee::getName));
    }

    public static void sortInc(Employee[] employees){
        Arrays.sort(employees, Comparator.comparing(Employee::getSalary).reversed().thenComparing(Employee::getName).reversed());

    }
}
