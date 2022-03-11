package lab1.dop;

import java.util.Random;
import java.util.Scanner;

public class RandomString {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n <= 13) {
            String str1 = withLong(n);
            System.out.println(str1 + " Длина строки " + str1.length());
        }
        String str2 = generateRandomString(n);
        System.out.println(str2 + " Длина строки " + str2.length());
    }

    public static String withLong(int n){
        var l = new Random().nextLong((long)(Math.pow(36, n) - 1) - (long)Math.pow(36, n - 1));
        l += (long)Math.pow(36, n - 1) + 1;
        String str = Long.toUnsignedString(l, 36);
        return str;
    }

    public static String withInt(int n){
        Random r = new Random();
        StringBuilder str_new = new StringBuilder();
        for(int i = 0; i < n; i++) {
            str_new.append(Integer.toString(r.nextInt(36), 36));
        }
        return str_new.toString();
    }

    public static String generateRandomString(int length){
        Random rand = new Random();
        String string = Long.toUnsignedString(rand.nextLong(), 36);
        if(string.length() > length)
            return string.substring(0, length);
        else if (string.length() < length){
            StringBuilder stringNew = new StringBuilder(string);
            int size = string.length();
            do{
                string = Long.toUnsignedString(rand.nextLong(), 36);
                if (string.length() + size <= length){
                    stringNew.append(string);
                    size += string.length();
                }
                else{
                    stringNew.append(string.substring(0, length - size));
                    size += length - size;
                }
            }while (size != length);
            return stringNew.toString();
        }
        else
            return string;
    }

}
