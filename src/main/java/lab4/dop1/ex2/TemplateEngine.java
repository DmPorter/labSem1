package lab4.dop1.ex2;

import lab4.dop1.ex1.Person;

import java.lang.reflect.Field;

public class TemplateEngine {
    public static void sendMessage(Object obj) throws NoSuchFieldException, IllegalAccessException {
        Class<?> clazz = obj.getClass();
        Field fieldName = clazz.getDeclaredField("username");
        Field fieldCount = clazz.getDeclaredField("count");
        fieldName.setAccessible(true);
        fieldCount.setAccessible(true);
        System.out.println("Hello, " + fieldName.get(obj) + ". You owe " + fieldCount.get(obj) + " rubles");
    }
}
