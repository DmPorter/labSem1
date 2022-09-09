package smth;

public class Ball implements Shape{
    double radius;

    public Ball(double radius){
        this.radius = radius;
    }
    @Override
    public double getSquare() {
        return (3.0/4) * 3.14 * Math.pow(radius, 3);
    }

    @Override
    public double getLenghtEdge() {
        return 4 * 3.14 * Math.pow(radius, 2);
    }
}
