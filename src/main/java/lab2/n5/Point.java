package lab2.n5;
/**
 * объект <code> класса Point</code> представляет класс точку
 * @author Fred Flintstone
 * @author Barney Rubble
 * (Aversion 1.1
 */

public class Point {
    private final double x;
    private final double y;


    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Point(){
        this(0,0);
    }

    /**
     * Возвращает координату x
     * @return координата x
     */
    public double getX(){
        return this.x;
    }

    /**
     * Возвращает координату y
     * @return координата y
     */
    public double getY(){
        return this.y;
    }

    /**
     * Смешает точку на заданные координаты
     * @param x смещение координаты x
     * @param y смещение координаты y
     * @return новый объект класса(точка, которая смещена)
     */
    public Point translate(double x, double y){
        return new Point(this.x + x, this.y + y);
    }

    /**
     * Умножает точку координаты точки на коэффицент
     * @param koff коэффицент увеличения
     * @return новый объект класса(новая точка)
     */
    public Point scale(double koff){
        return new Point(this.x * koff, this.y * koff);

    }
}
