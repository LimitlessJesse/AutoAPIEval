import java.util.concurrent.*;

public class ExecutorCompletionService_2 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(1);
        CompletionService<String> completionService = new ExecutorCompletionService<>(executor);

        Future<String> future = completionService.submit(() -> {
            return "Task completed";
        }, "Result");

        try {
            System.out.println(future.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        executor.shutdown();
    }
}
