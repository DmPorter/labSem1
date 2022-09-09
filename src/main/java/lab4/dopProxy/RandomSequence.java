package lab4.dopProxy;

import java.util.Random;

public class RandomSequence implements IntSequence{

    final Random random = new Random();
    final int val;

    public RandomSequence(){
        this(100);
    }

    public RandomSequence(int val){
        this.val = val;
    }

    @Override
    public int next() {
        return random.nextInt(val);
    }

    @Override
    public boolean hasNext() {
        return true;
    }

}
