package lab3.ex1;

import lab3.Employee;
import lab3.Measurable;

public class Main {
    public static void main(String[] args) {
        Measurable[] employees = {
                new Employee(1000),
                new Employee(2000),
                new Employee(3000)
        };

        System.out.println(average(employees));

    }

    public static double average(Measurable[] object){
        double val = 0;
        for(int i = 0; i < object.length; i++){
            val += object[i].getMeasure();
        }
        return object.length == 0 ? 0 : val / object.length;
    }
}
