import java.util.concurrent.*;

public class ExecutorCompletionService_5 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        ExecutorCompletionService<String> completionService = new ExecutorCompletionService<>(executor);

        completionService.submit(() -> {
            Thread.sleep(2000);
            return "Hello";
        });

        Future<String> future = completionService.poll(1000, TimeUnit.MILLISECONDS);
        if (future!= null) {
            System.out.println(future.get());
        } else {
            System.out.println("Timeout");
        }

        executor.shutdown();
    }
}
