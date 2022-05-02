package lab3.dop;

import java.util.ArrayList;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(){{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
        }};

        MyIterator<Integer> it = MyIterator.fromIterator(arr.iterator());
        MyIterator<Integer> itMap = it.map((a) -> a*a*a);

        while(itMap.hasNext()){
            System.out.println(itMap.next());
        }

        System.out.println();
        MyIterator<Integer> it1 = MyIterator.fromIterator(arr.iterator());
        MyIterator<Double> itMapSqrt = it1.map(Math::sqrt);

        while (itMapSqrt.hasNext()){
            System.out.println(itMapSqrt.next());
        }

        System.out.println();
        MyIterator<Integer> it2 = MyIterator.fromIterator(arr.iterator());
        it2.forEach((a) -> {
            a *= 2;
            System.out.println(a);
        });


        System.out.println();
        MyIterator<Integer> it3 = MyIterator.fromIterator(arr.iterator());
        it3.forEach(System.out::println);



    }
}
