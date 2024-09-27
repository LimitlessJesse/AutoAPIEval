import java.util.concurrent.*;
import java.util.ArrayList;

public class ExecutorCompletionService_2 {
    
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        ExecutorCompletionService<String> completionService = new ExecutorCompletionService<>(executor);
        
        completionService.submit(() -> {
            System.out.println("Task 1 is running...");
            return "Task 1";
        }, "Task 1 Result");
        
        Future<String> futureResult = completionService.take();
        System.out.println("Task 1 Result: " + futureResult.get());
        
        executor.shutdown();
    }
}
