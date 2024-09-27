import java.util.concurrent.*;

public class ExecutorCompletionService_3 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        CompletionService<String> completionService = new ExecutorCompletionService<>(executor);

        completionService.submit(() -> {
            Thread.sleep(2000);
            return "Hello";
        });

        Future<String> future = completionService.take();
        System.out.println(future.get());

        executor.shutdown();
    }
}
