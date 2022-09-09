package smth;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Shape[] arr = new Shape[4];
        arr[0] = new Circle(1.0);
        arr[1] = new Square(2);
        arr[2] = new Ball(4);
        arr[3] = new Ball(5);

        System.out.println(getSumEdge(arr));
        System.out.println(getSumSquare(arr));
    }

    public static double getSumSquare(Shape... args){
        double val = 0;
        for(Shape shape: args){
            val += shape.getSquare();
        }
        return val;
    }

    public static double getSumEdge(Shape... args){
        double val = 0;
        for(Shape shape: args){
            val += shape.getLenghtEdge();
        }
        return val;
    }
}
