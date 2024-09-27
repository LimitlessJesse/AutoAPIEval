import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.Executors;

public class ThreadPoolExecutor_CallerRunsPolicy_5 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        
        RejectedExecutionHandler handler = new ThreadPoolExecutor.CallerRunsPolicy();
        
        // Execute a task
        executor.execute(() -> {
            System.out.println("Task is being executed");
        });
        
        // Try to execute a task when executor is shutdown
        executor.shutdown();
        handler.rejectedExecution(() -> {
            System.out.println("Task is rejected");
        }, executor);
    }
}
