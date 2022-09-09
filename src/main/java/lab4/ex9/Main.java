package lab4.ex9;

import lab4.ex4_5.Point;
import lab4.ex4_5.Rectangle;

import javax.imageio.stream.ImageInputStream;
import javax.sound.midi.Soundbank;
import java.io.File;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) throws Exception {
        Rectangle rectangle = new Rectangle(new Point(1, 1), 100, 50);


        System.out.println(MyToString.myToString(rectangle));
        System.out.println(MyToString.myToString(new Point[]{new Point(1,2), new Point(2, 2), new Point(3, 3)}));

        System.out.println(MyToString.myToString(2));

        System.out.println(MyToString.myToString(new int[]{1,2,3,4}));

    }




}
