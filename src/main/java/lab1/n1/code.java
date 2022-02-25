package lab1.n1;

import java.util.Scanner;

public class code {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        Integer num = in.nextInt();
        System.out.println(Integer.toBinaryString(num));
        System.out.println(Integer.toOctalString(num));
        System.out.println(Integer.toHexString(num));
        System.out.println(Math.pow(Double.parseDouble(Integer.toHexString(num)), (double)-1));
    }
}
