package lab1.dop;

public class ExampleCase {

    public static void main(String[] args) {

        System.out.println(dayOfWeek(3.5));

    }

    public static String dayOfWeek(double n){
        if (n % 1 == 0)
            switch ((int)n){
                case 1:
                    return "Monday";
                case 2:
                    return "Tuesday";
                case 3:
                    return "Wednesday";
                case 4:
                    return "Thursday";
                case 5:
                    return "Friday";
                case 6:
                    return "Saturday";
                case 7:
                    return "Sunday";
                default:
                    return "None";
            }
        else return "None";
    }

    public static long factorial(int n){
        long res = 1;
        if(n == 0)
            return 1;
        for (int i = 1; i <= n; i++){
            res *= i;
        }
        return res;
    }
}
