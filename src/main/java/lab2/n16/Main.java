package lab2.n16;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Queue arr = new Queue();
        arr.add("1");
        arr.add("2");
        arr.add("3");
        arr.add("4");

        Queue arr_new = new Queue();
        arr_new.add("rrr");

        Queue.Iterator it = arr.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(arr);

    }
}
