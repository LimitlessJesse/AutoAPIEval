import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.Executors;

public class ThreadPoolExecutor_DiscardPolicy_1 {
    public static void main(String[] args) {
        RejectedExecutionHandler handler = new ThreadPoolExecutor.DiscardPolicy();
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        
        executor.setRejectedExecutionHandler(handler);
        
        executor.execute(() -> System.out.println("Task 1"));
        executor.execute(() -> System.out.println("Task 2"));
        executor.execute(() -> System.out.println("Task 3"));
        
        executor.shutdown();
    }
}
