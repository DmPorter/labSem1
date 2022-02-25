package lab1.n7;

import java.util.Scanner;

public class code {
    static final short max_value = 32767;

    private static short inShort() {
        Scanner in = new Scanner(System.in);

        return (short)(in.nextInt() - max_value);
    }

    public static void main(String[] args){
        short one = inShort();
        short two = inShort();

        System.out.println(one + " " + two);
        System.out.println("sum: "+(short)(one + two + 2*max_value));
        System.out.println("difference: "+(short)(one-two));
        System.out.println("product: "+(short)((one + max_value) * (two + max_value)));
        System.out.println("quotient: "+(short)((one + max_value) / (two + max_value)));
        System.out.println("remainder: "+(short)(one + max_value) % (two + max_value));
    }
}
