package lab1.n2;

import java.util.Scanner;

public class Code {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int angle = in.nextInt();
        System.out.println((angle>= 0) ? angle % 360 : (angle % 360) + 360);
        System.out.println(Math.floorMod(angle, 360));
    }
}
