import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolExecutor_AbortPolicy_1 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 0L, null, new ThreadPoolExecutor.AbortPolicy());
        
        executor.rejectedExecution(() -> {
            System.out.println("Task rejected");
        }, executor);
        
        executor.shutdown();
    }
}
