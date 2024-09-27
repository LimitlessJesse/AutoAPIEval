import java.util.concurrent.*;

public class ExecutorCompletionService_1 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        ExecutorCompletionService<Integer> ecs = new ExecutorCompletionService<>(executor);

        // Task to be executed
        Callable<Integer> task = () -> {
            return 1;
        };

        // Submit task to ExecutorCompletionService
        Future<Integer> future = ecs.submit(task);

        try {
            // Wait for task to complete and get the result
            int result = future.get();
            System.out.println("Result: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        executor.shutdown();
    }
}
