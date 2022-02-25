package lab2.n4;

public class code {

    public static void main(String[] args) {
        Integer a = 2;
        Integer b = 4;
        swap(a, b);
        System.out.println(a + " " + b);
    }

    public static void swap(Integer a, Integer b){
        Integer c = b;
        b = a;
        a = c;
    }
}
