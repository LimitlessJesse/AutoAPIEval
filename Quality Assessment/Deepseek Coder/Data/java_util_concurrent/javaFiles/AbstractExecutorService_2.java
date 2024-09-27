import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AbstractExecutorService_2 {
    public static void main(String[] args) {
        // Create an executor service
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // Create a task
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Task executed");
            }
        };

        // Submit the task
        Future<?> future = executorService.submit(task);

        // Close the executor service
        executorService.shutdown();
    }
}
