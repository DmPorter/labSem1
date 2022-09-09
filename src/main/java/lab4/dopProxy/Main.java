package lab4.dopProxy;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        IntSequence obj = (IntSequence) ProxyLog.proxyLog(RandomSequence.class);

        for(int i = 0; i < 10; i++){
            obj.nextMultiply(i);
        }
    }
}
