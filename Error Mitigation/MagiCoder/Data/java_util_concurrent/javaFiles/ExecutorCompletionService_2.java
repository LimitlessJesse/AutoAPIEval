import java.util.concurrent.*;

public class ExecutorCompletionService_2 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        ExecutorCompletionService<String> completionService = new ExecutorCompletionService<>(executor);

        Future<String> future = completionService.submit(() -> {
            Thread.sleep(1000);
            return "Hello, World!";
        });

        try {
            String result = future.get();
            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        executor.shutdown();
    }
}
