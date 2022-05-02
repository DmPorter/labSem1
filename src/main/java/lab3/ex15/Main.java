package lab3.ex15;

import lab3.IntSequence;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
//        IntSequence[] arr = {
//                new RandomSequence(1, 20),
//                new RandomSequence(1, 20),
//                new RandomSequence(1, 20, 3)
//        };
//        for (int i = 0; i < 20; i++) {
//            for(var val: arr){
//                System.out.print(val.next() + " ");
//            }
//            System.out.println();
//        }
        IntSequence arr = new RandomSequence(1, 20);
        for(int i = 0; i < 5; i++){
            System.out.println(arr.next());
        }
        System.out.println();
        for(int i = 0; i < 5; i++){
            System.out.println(arr.next());
        }

    }

    private static IntSequence randomInts(int low, int high) {
        return new RandomSequence(low, high);
    }

    private static class RandomSequence implements IntSequence {
        private final Random generator;
        private final int low;
        private final int high;

        RandomSequence(int low, int high){
             this(low, high, 0);
        }
        RandomSequence(int low, int high, int seed) {
            this.low = low;
            this.high = high;
            generator = new Random(seed);
        }


        public int next() {
            return low + generator.nextInt(high - low + 1);
        }

        public boolean hasNext() {
            return true;
        }
    }
}
