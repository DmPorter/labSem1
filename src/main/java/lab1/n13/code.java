package lab1.n13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class code {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList();
        ArrayList<Integer> list_new = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 49; i++){
            list.add(i+1);
        }
        System.out.println(list);

        for (int i = 0; i < 6; i++) {
            list_new.add(list.remove(rand.nextInt(49 - i)));
        }
        Collections.sort(list_new);
        System.out.println(list_new);
    }
}
