package lab3.ex9;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws Exception {

        Runnable[] tasks = generateTasks(50);

        runTogether(tasks);

        System.out.println("------------------------------------------------------");

        runInOrder(tasks);
    }

    private static Runnable[] generateTasks(int count) {
        List<Runnable> list = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            String x = String.valueOf(i + 1);
            list.add(() -> {
                for (int j = 0; j < 1000; j++) {
                }
                System.out.println(x);
            });
        }

        return list.toArray(new Runnable[]{});
    }

    private static void runTogether(Runnable... tasks) throws Exception {
        ExecutorService exec = Executors.newFixedThreadPool(tasks.length);
        for (Runnable task : tasks) {
            exec.execute(task);
        }
        exec.awaitTermination(1, TimeUnit.SECONDS);
        exec.shutdown();
    }

    private static void runInOrder(Runnable... tasks) {
        for (Runnable task : tasks) {
            task.run();
        }
    }
}
