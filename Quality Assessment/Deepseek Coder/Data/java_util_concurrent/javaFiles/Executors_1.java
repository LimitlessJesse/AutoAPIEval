import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executors_1 {
    public static void main(String[] args) {
        // Create a fixed thread pool with 5 threads
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        // Submit tasks to the executor service
        for (int i = 0; i < 10; i++) {
            final int taskId = i;
            executorService.submit(() -> {
                System.out.println("Task " + taskId + " is running on thread " + Thread.currentThread().getName());
            });
        }

        // Shutdown the executor service
        executorService.shutdown();
    }
}
