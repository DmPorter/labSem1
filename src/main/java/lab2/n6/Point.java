package lab2.n6;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Point(){
        this(0,0);
    }

    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }

    public void translate(double x_t, double y_t){
        this.x += x_t;
        this.y += y_t;
    }

    public void scale(double koff){
        this.x *= koff;
        this.y *= koff;

    }
}
