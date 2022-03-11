package lab1;

import jdk.dynalink.linker.support.CompositeGuardingDynamicLinker;

import java.math.BigInteger;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double d = Integer.MAX_VALUE;
        d++;
        System.out.println(Integer.MAX_VALUE);
        System.out.println((int)(d));
        System.out.println(d);
    }



    public static String DayOfWeek(double n){
        if (n % 1 == 0)
            switch ((int)n){
                case 1:
                    return "Monday";
                case 2:
                    return "Tuesday";
                case 3:
                    return "Wednesday";
                case 4:
                    return "Thursday";
                case 5:
                    return "Friday";
                case 6:
                    return "Saturday";
                case 7:
                    return "Sunday";
                default:
                    return "None";
            }
        else return "None";
    }

    public static long factorial(int n){
        long res = 1;
        if(n == 0)
            return 1;
        for (int i = 1; i <= n; i++){
            res *= i;
        }
        return res;
    }
}
