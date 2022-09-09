package smth;

public class Square implements Shape{
    double a;

    public Square(double a){
        this.a = a;
    }

    @Override
    public double getSquare() {
        return a*a;
    }

    @Override
    public double getLenghtEdge() {
        return 4*a;
    }

}
