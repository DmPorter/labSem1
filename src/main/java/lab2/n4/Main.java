package lab2.n4;

import org.glassfish.grizzly.utils.Holder;
import org.omg.CORBA.IntHolder;

public class Main {

    public static void main(String[] args) {
        Integer a = 2;
        Integer b = 4;
        IntHolder numOne = new IntHolder(a);
        IntHolder numTwo = new IntHolder(b);
        swap(a, b);
        swap(numOne, numTwo);
        System.out.println(a + " " + b);
        System.out.println(numOne.value + " " + numTwo.value);
    }

    public static void swap(Integer a, Integer b){
        Integer c = b;
        b = a;
        a = c;
    }


    public static void swap(IntHolder a, IntHolder b){
        IntHolder c = new IntHolder(b.value);
        b.value = a.value;
        a.value = c.value;
    }
}
