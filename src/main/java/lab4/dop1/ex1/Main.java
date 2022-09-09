package lab4.dop1.ex1;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Person p = new Person("Dima", 20);
        System.out.println(p.getName() + " " + getAgePerson(p));


    }

    public static int getAgePerson(Person person) throws IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Person.class;
        Field field = clazz.getDeclaredField("age");

        return (int) field.get(person);

    }
}
