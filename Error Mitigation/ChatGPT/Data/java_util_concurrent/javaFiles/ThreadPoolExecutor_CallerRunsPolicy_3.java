import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.Executors;

public class ThreadPoolExecutor_CallerRunsPolicy_3 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        
        RejectedExecutionHandler handler = new ThreadPoolExecutor.CallerRunsPolicy();
        
        // Creating a new task
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Executing task in caller's thread");
            }
        };
        
        // Submitting the task to the executor
        executor.submit(task);
        
        // RejectedExecutionHandler will handle the rejected task
        handler.rejectedExecution(task, executor);
    }
}
