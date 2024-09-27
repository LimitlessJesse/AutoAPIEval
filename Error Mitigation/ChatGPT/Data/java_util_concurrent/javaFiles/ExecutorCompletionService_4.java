import java.util.concurrent.*;

public class ExecutorCompletionService_4 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        CompletionService<String> completionService = new ExecutorCompletionService<>(executor);

        // Submit tasks to the completion service
        completionService.submit(() -> "Task 1");
        completionService.submit(() -> "Task 2");

        // Retrieve and remove the completed tasks
        Future<String> future1 = completionService.poll();
        Future<String> future2 = completionService.poll();

        try {
            System.out.println(future1.get());
            System.out.println(future2.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        executor.shutdown();
    }
}
