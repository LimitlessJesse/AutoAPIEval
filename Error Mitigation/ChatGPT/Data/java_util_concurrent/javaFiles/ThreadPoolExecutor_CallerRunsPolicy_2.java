import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.Executors;

public class ThreadPoolExecutor_CallerRunsPolicy_2 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        
        RejectedExecutionHandler handler = new ThreadPoolExecutor.CallerRunsPolicy();
        
        executor.setRejectedExecutionHandler(handler);
        
        executor.execute(() -> {
            System.out.println("Task 1 is running");
        });
        
        executor.execute(() -> {
            System.out.println("Task 2 is running");
        });
        
        executor.execute(() -> {
            System.out.println("Task 3 is running");
        });
        
        executor.shutdown();
    }
}
