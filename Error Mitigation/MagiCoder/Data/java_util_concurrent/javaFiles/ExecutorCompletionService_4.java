import java.util.concurrent.*;

public class ExecutorCompletionService_4 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        ExecutorCompletionService<String> completionService = new ExecutorCompletionService<>(executor);

        completionService.submit(() -> {
            Thread.sleep(1000);
            return "Hello";
        });

        Future<String> future = completionService.poll();

        if (future!= null) {
            try {
                System.out.println(future.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();
    }
}
