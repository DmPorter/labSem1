package lab3.ex7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(){{
            add("asd");
            add("aa");
            add("b");
            add("asasdasdasdasdaa");
            add("sssdfdffdd");
            add("assdesasdsadasdas");
            add("as");
            add("a");
            add("ad");
        }};
        System.out.println(strings);
        luckySort(strings, Comparator.comparing(String::length).thenComparing(String::compareTo));
        System.out.println(strings);
    }

    static void luckySort(ArrayList<String> strings, Comparator<String> comp) {
        while (true) {
            Collections.shuffle(strings);
            boolean flag = true;
            for (int i = 0; i < strings.size() - 1; i++) {
                if (comp.compare(strings.get(i + 1), strings.get(i)) < 0) {
                    flag = false;
                }
            }
            if(flag) return;
        }
    }
}
