package smth;

public class Circle implements Shape{
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        return 3.14 * radius * radius;
    }

    @Override
    public double getLenghtEdge() {
        return 2 * 3.14 * radius;
    }




}
