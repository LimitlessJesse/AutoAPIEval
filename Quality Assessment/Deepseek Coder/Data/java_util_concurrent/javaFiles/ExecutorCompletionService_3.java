import java.util.concurrent.*;

public class ExecutorCompletionService_3 {
    public static void main(String[] args) {
        // Create an ExecutorCompletionService with a thread pool of size 1
        ExecutorService executor = Executors.newFixedThreadPool(1);
        ExecutorCompletionService<String> completionService = new ExecutorCompletionService<>(executor);

        // Submit a task to the completion service
        Future<String> future = completionService.submit(() -> {
            // Simulate some work
            Thread.sleep(1000);
            return "Hello, World!";
        }, "Default Result");

        // Wait for the task to complete and get the result
        try {
            String result = future.get();
            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Shutdown the executor
        executor.shutdown();
    }
}
