import java.util.concurrent.*;

public class ExecutorCompletionService_5 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        ExecutorCompletionService<Integer> completionService = new ExecutorCompletionService<>(executor);

        Future<Integer> future = completionService.poll(5, TimeUnit.SECONDS);

        if (future != null) {
            try {
                Integer result = future.get();
                System.out.println("Result: " + result);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("No task completed within the timeout");
        }

        executor.shutdown();
    }
}
