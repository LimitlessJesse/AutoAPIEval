import java.util.concurrent.*;

public class ExecutorCompletionService_2 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(1);
        ExecutorCompletionService<String> completionService = new ExecutorCompletionService<>(executor);

        Callable<String> task = () -> {
            Thread.sleep(1000);
            return "Task completed";
        };

        Future<String> future = completionService.submit(task);

        System.out.println("Waiting for task completion...");
        Future<String> completedFuture = completionService.take();
        System.out.println("Task completed: " + completedFuture.get());

        executor.shutdown();
    }
}
