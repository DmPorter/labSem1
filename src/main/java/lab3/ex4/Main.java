package lab3.ex4;

import lab3.IntSequence;

public class Main {
    public static void main(String[] args) {
        IntSequence arr = IntSequence.of(2,3,4,5,6,7,8);
        while(arr.hasNext()){
            System.out.println(arr.next());
        }
    }

}
