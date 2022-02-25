package lab1.n3;

import java.util.Scanner;

public class code {

    public static int MaxInt(int num1, int num2, int num3){
        if (num1 > num2){
            if (num1 > num3)
                return num1;
            else
                return num3;

        }
        else if (num2 > num3)
            return num2;
        else
            return num3;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        System.out.println(MaxInt(num1, num2, num3));
        System.out.println(Math.max(Math.max(num1, num2), num3));
    }
}
