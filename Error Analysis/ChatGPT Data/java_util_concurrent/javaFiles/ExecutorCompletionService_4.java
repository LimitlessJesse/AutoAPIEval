import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Future;

public class ExecutorCompletionService_4 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        ExecutorCompletionService<Integer> completionService = new ExecutorCompletionService<>(executor);

        // submitting a task
        completionService.submit(() -> {
            Thread.sleep(2000);
            return 5;
        });

        // polling for the result
        try {
            Future<Integer> future = completionService.poll();
            if (future != null) {
                System.out.println("Result: " + future.get());
            } else {
                System.out.println("No task completed yet");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        executor.shutdown();
    }
}
