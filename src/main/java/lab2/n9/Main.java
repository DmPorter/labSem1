package lab2.n9;

public class Main {
    public static void main(String[] args) {
        Car a = new Car(10);
        a.new_fuel(10);
        a.move_max();
        System.out.println(a.getX());
    }
}
