import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.Executors;

public class ThreadPoolExecutor_CallerRunsPolicy_4 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        
        RejectedExecutionHandler handler = new ThreadPoolExecutor.CallerRunsPolicy();
        handler.rejectedExecution(() -> System.out.println("Task is rejected"), executor);
    }
}
