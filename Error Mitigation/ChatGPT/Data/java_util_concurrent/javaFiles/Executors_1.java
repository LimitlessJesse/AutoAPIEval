import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executors_1 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        // Execute tasks using the executor
        executor.execute(() -> {
            System.out.println("Task 1 executed by thread: " + Thread.currentThread().getName());
        });
        executor.execute(() -> {
            System.out.println("Task 2 executed by thread: " + Thread.currentThread().getName());
        });
        // Shutdown the executor
        executor.shutdown();
    }
}
