package lab3.ex5;

import lab3.IntSequence;

public class Main {
    public static void main(String[] args) {
//        IntSequence c = IntSequence.constant(2);
//        while(c.hasNext()){
//            System.out.println(c.next());
//        }

        IntSequence c1 = IntSequence.constantLambda(2);
        while(c1.hasNext()){
            System.out.println(c1.next());
        }
    }
}
