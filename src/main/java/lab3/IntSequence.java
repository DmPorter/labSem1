package lab3;

import java.util.Arrays;
import java.util.NoSuchElementException;

public interface IntSequence {
    int next();

    default boolean hasNext(){
        return true;
    }

    static IntSequence of(int... values){
        return new IntSequence() {

            final int[] elementData = Arrays.copyOf(values, values.length);
            int cursor;

            @Override
            public int next() {
                if (cursor >= elementData.length) {
                    throw new NoSuchElementException();
                } else {
                    return elementData[cursor++];
                }
            }

            @Override
            public boolean hasNext() {
                return cursor < elementData.length;
            }
        };
    }

    static IntSequence constantLambda(final int i) {
        return () -> i;
    }

    static IntSequence constant(int a){
        return new IntSequence() {
            final int i = a;
            @Override
            public int next() {
                return i;
            }
        };
    }
}
