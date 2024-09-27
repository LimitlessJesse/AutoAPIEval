import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolExecutor_CallerRunsPolicy_1 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 0L, null, new ThreadPoolExecutor.CallerRunsPolicy());
        
        executor.rejectedExecution(() -> {
            System.out.println("Task has been rejected");
        }, executor);
    }
}
