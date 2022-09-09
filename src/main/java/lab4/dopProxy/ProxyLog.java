package lab4.dopProxy;

import java.lang.reflect.*;
import java.util.Arrays;

public class ProxyLog {


    public static Object proxyLog(Class<?> cl) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Object obj = cl.getConstructor().newInstance();

        InvocationHandler ih = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object val = method.invoke(obj, args);
                System.out.println(obj.getClass().getName() + " " + method.getName() + Arrays.toString(args) + " = " + val);
                return val;
            }
        };

        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), ih);
    }
}
