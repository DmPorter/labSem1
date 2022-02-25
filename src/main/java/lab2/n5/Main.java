package lab2.n5;


public class Main {


    public static void main(String[] args) {
        Point P = new Point(3, 4).translate(1, 3).scale(0.5);
        System.out.println(P.getX() + " " + P.getY());
    }
}
