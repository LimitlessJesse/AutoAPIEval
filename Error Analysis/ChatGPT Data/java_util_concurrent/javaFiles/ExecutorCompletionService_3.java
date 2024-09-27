import java.util.concurrent.*;

public class ExecutorCompletionService_3 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        ExecutorCompletionService<String> ecs = new ExecutorCompletionService<>(executor);

        // Submitting a task
        ecs.submit(() -> {
            return "Task Result";
        });

        // Taking the completed task
        Future<String> future = ecs.take();
        System.out.println(future.get()); // Output: Task Result

        executor.shutdown();
    }
}
