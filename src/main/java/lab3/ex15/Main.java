package lab3.ex15;

import lab3.IntSequence;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        IntSequence sequence = randomInts(1, 20);
        for (int i = 0; i < 20; i++) {
            System.out.println(sequence.next());
        }

    }

    private static IntSequence randomInts(int low, int high) {
        return new RandomSequence(low, high);
    }

    private static class RandomSequence implements IntSequence {
        private final Random generator = new Random();
        private int low, high;

        RandomSequence(int low, int high) {
            this.low = low;
            this.high = high;
        }

        public int next() {
            return low + generator.nextInt(high - low + 1);
        }

        public boolean hasNext() {
            return true;
        }
    }
}
