package lab2.n16;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Queue arr = new Queue();
        arr.add("1");
        arr.add("2");
        arr.add("3");
        arr.add("4");
        System.out.println(arr);

        System.out.println("Remove " + arr.remove());

        System.out.println(arr);
        System.out.println();


        Queue.Iterator it = arr.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println();
        System.out.println(arr);

    }
}
