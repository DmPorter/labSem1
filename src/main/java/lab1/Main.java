package lab1;

import jdk.dynalink.linker.support.CompositeGuardingDynamicLinker;

import java.math.BigInteger;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < n; i++){
            ArrayList<Integer> line = new ArrayList<>();
            line.add(0, 1);
            if (i != 0) {
                for (int j = 1; j < i; j++) {
                    int m = arr.get(i - 1).get(j - 1) + arr.get(i - 1).get(j);
                    line.add(m);
                }
                line.add(1);
            }
            arr.add(line);
        }
        int j =n;
        for (ArrayList<Integer> line : arr){
            for (int i = 1; i<j; i++){
                System.out.print ("\t");
            }

            for (int i : line){
                System.out.printf("\t%12d", i);
            }
            j--;
            System.out.println();
        }
    }
}
