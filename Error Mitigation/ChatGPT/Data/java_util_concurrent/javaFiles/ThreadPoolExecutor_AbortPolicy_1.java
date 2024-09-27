import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.RejectedExecutionException;

public class ThreadPoolExecutor_AbortPolicy_1 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 0L, null, new ThreadPoolExecutor.AbortPolicy());
        
        try {
            executor.rejectedExecution(() -> System.out.println("Task rejected"), executor);
        } catch (RejectedExecutionException e) {
            System.out.println("Task rejected and RejectedExecutionException thrown");
        }
    }
}
