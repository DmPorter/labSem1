package lab2.n16;

public class Main {
    public static void main(String[] args) {
        Queue arr = new Queue();
        arr.add("asd");
        arr.add("sss");
        arr.add("fff");

        Queue arr_new = new Queue();
        arr_new.add("rrr");

        Queue.Iterator it = arr.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(arr);
    }
}
