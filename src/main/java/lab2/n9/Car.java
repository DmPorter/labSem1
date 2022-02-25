package lab2.n9;

public class Car {
    private double x;
    private double fuel;
    private final double fuel_efficency;


    public Car(double fuel_efficency){
        this.x = 0;
        this.fuel = 0;
        this.fuel_efficency = fuel_efficency;
    }

    public void new_fuel(double fuel){
        this.fuel += fuel;
    }

    public double getFuel() {
        return fuel;
    }

    public double getX() {
        return x;
    }

    public void move_max(){
        this.x += this.fuel * this.fuel_efficency;
        this.fuel = 0;
    }

    public void move_km(double x){
        double fuel_consumption = x / this.fuel_efficency;
        double max_move_fuel = this.fuel - fuel_consumption;
        if (max_move_fuel < 0){
            max_move_fuel = Math.abs(max_move_fuel);
            max_move_fuel = x - max_move_fuel;
            double move = max_move_fuel*this.fuel_efficency;
            this.x += move;
            this.fuel = 0;
            System.out.println("Автомобиль проехал только " + move + " км");
        }
        else {
            this.x += x;
            this.fuel -= fuel_consumption;
        }
    }
}
