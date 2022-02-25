package lab1;

import jdk.dynalink.linker.support.CompositeGuardingDynamicLinker;

import java.math.BigInteger;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int l = 10;
        int n = 0;
//        for (int i = 0; i < l; i++){
//            int m = i;
//            n = i;
//            System.out.println(m);
//        }

        while(true){
            double[] m = new double[200000000];
            double[] lop = new double[200000000];
        }



//        while(true){
//            System.gc();
//            Runtime.getRuntime().gc();
//        }
//        int c = (int) (3 * Math.pow(10,8));
//        int m = 100;
//        long E = (long) m * c * c;
//        System.out.println(E + " " + (int)E);



    }

    public static void sw(int i){
        switch (i){
            case -1:
                System.out.println("Error!");
                break;
            case 0:
                System.out.println("Ok!");
                break;
            case 1:
                System.out.println("It's done!");
                break;
            default:
                System.out.println("Something went wrong");
                break;

        }
    }
}
