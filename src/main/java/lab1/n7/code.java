package lab1.n7;

import java.util.Scanner;

public class code {
    static final short MAX_VALUE = 32767;

    private static short inShort() {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (0 <= num && num<= 65535) {
            return (short) (num - MAX_VALUE);
        }else{
                throw new RuntimeException("It's not usignshort!");
        }


    }

    public static void main(String[] args){
        short one = inShort();
        short two = inShort();


        System.out.println("sum: "+add(one, two));
        System.out.println("difference: "+diff(one, two));
        System.out.println("product: "+prod(one, two));
        System.out.println("quotient: "+quot(one, two));
        System.out.println("remainder: "+rem(one, two));
    }

    public static int add(short one, short two){
        int result = (one + two) +2* MAX_VALUE;
        if (0 <= result && result<= 65535){
            return result;
        }else if (result > 65535){
            return 65535;
        }else{
            return 0;
        }
    }

    public static int diff(short one, short two){
        int result = one- two;
        if (0 <= result){
            return result;
        }else {
            return 0;
        }
    }
    public static int quot(short one, short two){
        int result = (one + MAX_VALUE) / (two + MAX_VALUE);
        if (0 <= result){
            return result;
        }else {
            return 0;
        }
    }

    public static int prod(short one, short two){
        int result = (one + MAX_VALUE) * (two + MAX_VALUE);
        if (0 <= result && result<= 65535){
            return result;
        }else if (result > 65535){
            return 65535;
        }else{
            return 0;
        }
    }

    public static int rem(short one, short two){
        int result = (one + MAX_VALUE) % (two + MAX_VALUE);
        if (0 <= result){
            return result;
        }else {
            return 0;
        }
    }

}
