package lab4.ex13;

import java.lang.reflect.Method;
import java.util.function.DoubleFunction;

public class Main {
    public static void main(String[] args) throws Exception {
        print(Math.class.getMethod("sqrt", double.class), 1, 9, 0.89);
        print(Double.class.getMethod("toHexString", double.class), 1, 9, 0.89);

        printWithFunction(Math::sqrt, 1, 9, 0.89);
        printWithFunction(Double::toHexString, 1, 9, 0.89);
    }

    public static void print(Method m, double lower, double upper, double step) throws Exception {
        System.out.println(m.getDeclaringClass().getCanonicalName() + "." + m.getName());
        for (double i = lower; i <= upper; i += step) {
            System.out.printf("%.2f | %s\n", i, m.invoke(null, i));
        }
    }


    public static <T> void printWithFunction(DoubleFunction<T> function, double lower, double upper, double step){
        System.out.println();
        for (double i = lower; i <= upper; i += step) {
            System.out.printf("%.2f | %s\n", i, function.apply(i));
        }
    }
}
