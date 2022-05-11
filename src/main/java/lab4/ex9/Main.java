package lab4.ex9;

import lab4.ex4_5.Point;
import lab4.ex4_5.Rectangle;

import javax.imageio.stream.ImageInputStream;
import java.lang.reflect.Field;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) throws Exception {
        Rectangle rectangle = new Rectangle(new Point(1, 1), 100, 50);
        Integer a1 = 2;
        System.out.println(toString(rectangle));
        System.out.println(toString(a1));
    }

    public static String toString(Object o) throws Exception {
        Class<?> clazz = o.getClass();
        StringJoiner joiner = new StringJoiner(",", clazz.getName() + "{", "}");
        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            joiner.add(field.getName() + "=" + field.get(o).toString());
        }
        return joiner.toString();
    }
}
