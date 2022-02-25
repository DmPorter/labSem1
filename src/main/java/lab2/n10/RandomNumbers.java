package lab2.n10;

import java.util.ArrayList;
import java.util.Random;

public class RandomNumbers {
    private static Random generator = new Random();

    public static int nextInt(int low, int high) {
        return low + generator.nextInt(high - low + 1);
    }

    public static int randomElement(int[] arr){
        return arr.length == 0 ? 0 : arr[generator.nextInt(arr.length)];
    }

    public static int randomElement(ArrayList<Integer> arr){
        return arr.size() == 0 ? 0 : arr.get(generator.nextInt(arr.size()));
    }

}
