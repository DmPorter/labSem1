package lab1.n5;

public class Code {
    public static void main(String[] args){
        double num = Integer.MAX_VALUE;
        num+= 1;
        num += 0.2;
        System.out.println(num);
        int num_int = (int)num;
        System.out.println("Max integer + 1 to int " + num_int);

        double numDouble = Double.MAX_VALUE;
        int numDoubleInt = (int)numDouble;
        System.out.println("Max double to int " + numDoubleInt);
    }
}
