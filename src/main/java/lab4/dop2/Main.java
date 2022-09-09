package lab4.dop2;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        MyClassLoader mcl = new MyClassLoader();
        Class<?> clazz = mcl.findClass("Point");
        System.out.println(clazz.getName());
        System.out.println(mcl.getParent().getParent());

        Class<?> clazz1 = Class.forName("Point", false, mcl);
        System.out.println(clazz1.getName());


    }
}
