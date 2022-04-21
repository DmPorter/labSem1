package lab3.ex13;

public class Main {
    public static void main(String[] args) {
        Runnable[] runnables = new Runnable[]{
                () -> System.out.println("1"),
                () -> System.out.println("2"),
                () -> System.out.println("3")
        };
        runnables[1].run();
        Runnable run = get(runnables);
        run.run();
    }
    private static Runnable get(Runnable[] runnables) {
        return () -> {
            for (Runnable r : runnables) {
                r.run();
            }
        };
    }
}
