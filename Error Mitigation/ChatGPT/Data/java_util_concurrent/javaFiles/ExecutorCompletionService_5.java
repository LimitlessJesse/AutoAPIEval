import java.util.concurrent.*;

public class ExecutorCompletionService_5 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(1);
        CompletionService<String> completionService = new ExecutorCompletionService<>(executor);

        // Submit a task
        Future<String> future = completionService.submit(() -> {
            Thread.sleep(2000); // Simulating a task that takes 2 seconds to complete
            return "Task completed";
        });

        try {
            // Poll for the completed task with a timeout of 3 seconds
            Future<String> completedTask = completionService.poll(3, TimeUnit.SECONDS);

            if (completedTask != null) {
                System.out.println(completedTask.get()); // Output: Task completed
            } else {
                System.out.println("No task completed within the specified timeout");
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        executor.shutdown();
    }
}
