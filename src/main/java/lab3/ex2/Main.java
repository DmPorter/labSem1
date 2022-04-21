package lab3.ex2;

import lab3.*;

public class Main {
    public static void main(String[] args) {
        Measurable[] employees = {
                new Employee("Bill", 1000),
                new Employee("Nick", 3000),
                new Employee("Bob", 2500)
        };

        Employee l = (Employee) largest(employees);

        if(l != null) System.out.println(l.getMeasure());
    }

    private static Measurable largest(Measurable[] objects) {
        if (objects.length == 0) return null;
        Measurable max =objects[0];
        for(Measurable val: objects){
            if(val.getMeasure() > max.getMeasure()){
                max = val;
            }
        }
        return max;
    }
}
