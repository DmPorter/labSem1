package lab1.dop;

import java.util.Random;
import java.util.Scanner;

public class code {

    public static String WithLong(int n){
        var l = new Random().nextLong((long)(Math.pow(36, n) - 1) - (long)Math.pow(36, n - 1));
        l += (long)Math.pow(36, n - 1) + 1;
        String str = Long.toUnsignedString(l, 36);
        return str;
    }

    public static String WithInt(int n){
        Random r = new Random();
        StringBuilder str_new = new StringBuilder();
        for(int i = 0; i < n; i++) {
            str_new.append(Integer.toString(r.nextInt(36), 36));
        }
        return str_new.toString();
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n <= 13) {
            String str1 = WithLong(n);
            System.out.println(str1 + " Длина строки " + str1.length());
        }
        String str2 = WithInt(n);
        System.out.println(str2 + " Длина строки " + str2.length());
    }
}
