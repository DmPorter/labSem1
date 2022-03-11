package lab1.n6;

import java.math.BigInteger;
import java.util.Scanner;

public class Code {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        BigInteger res = new BigInteger(String.valueOf(1));
        for (int i = 1; i <= value; i++){
            res = res.multiply(BigInteger.valueOf(i));
        }
        System.out.println(res);
    }
}
