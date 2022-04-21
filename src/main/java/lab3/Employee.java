package lab3;

public class Employee implements Measurable {

    private static int idLast = 0;

    private int id;
    private String name;
    private double salary;

    public Employee(int salary){
        id = ++idLast;
        this.salary = salary;
    }

    public Employee(String name, int salary){
        id = ++idLast;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getMeasure(){
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
