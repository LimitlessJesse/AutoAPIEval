import java.util.concurrent.*;

public class ExecutorCompletionService_3 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        CompletionService<String> completionService = new ExecutorCompletionService<>(executor);

        // Submit a task
        Future<String> future = completionService.submit(() -> {
            Thread.sleep(2000);
            return "Task completed";
        });

        try {
            // Retrieve and remove the completed task
            Future<String> completedTask = completionService.take();
            System.out.println(completedTask.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        executor.shutdown();
    }
}
