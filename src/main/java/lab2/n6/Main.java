package lab2.n6;

public class Main {

    public static void main(String[] args) {
        Point P = new Point(3, 4);
        P.translate(1,3);
        P.scale(0.5);

        System.out.println(P.getX() + " " + P.getY());
    }
}
