package lab2.n10;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import java.util.stream.IntStream;

import static lab2.n10.RandomNumbers.randomElement;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>() {{
            add(1);
            add(2);
            add(3);
        }};


        ArrayList<Integer> list_null = new ArrayList<>();

        System.out.println(randomElement(list_null));
        System.out.println(randomElement(list));
        System.out.println(randomElement(new int[]{1,2,3,4,5}));
        System.out.println(randomElement(new int[0]));

    }
}
