package lab1.n5;

public class Code {
    public static void main(String[] args){
        double num = Integer.MAX_VALUE;
        System.out.println(num);
        num+= 2;
        int num_int = (int)num;
        System.out.println(num_int + " " + (num_int + 1));
        System.out.println(num  + " Max double: "+ Double.MAX_VALUE + " Max integer " + Integer.MAX_VALUE);
    }
}
