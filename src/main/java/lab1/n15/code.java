package lab1.n15;

import java.util.ArrayList;
import java.util.Scanner;

public class code {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>(n);
        for (int i = 0; i < n; i++){
            ArrayList<Integer> line = new ArrayList<>();
            line.add(0, 1);
            if (i != 0) {
                for (int j = 1; j < i; j++) {
                    int m = arr.get(i - 1).get(j - 1) + arr.get(i - 1).get(j);
                    line.add(j, m);
                }
                line.add(1);
            }
            arr.add(line);
        }
        for (ArrayList<Integer> line : arr){
            for (int i : line){
                System.out.printf("%5d", i);
            }
            System.out.println();
        }
    }
}
