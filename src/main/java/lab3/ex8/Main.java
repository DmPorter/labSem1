package lab3.ex8;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Greeter(10, "Java"));
        Thread thread2 = new Thread(new Greeter(10, "World"));
        thread1.start();
        thread2.start();
    }
}
