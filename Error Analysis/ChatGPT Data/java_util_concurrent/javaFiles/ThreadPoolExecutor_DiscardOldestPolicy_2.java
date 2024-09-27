import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolExecutor_DiscardOldestPolicy_2 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 0L, null, new ThreadPoolExecutor.DiscardOldestPolicy());
        
        executor.execute(() -> System.out.println("Task 1"));
        executor.execute(() -> System.out.println("Task 2"));
        executor.execute(() -> System.out.println("Task 3"));
        
        executor.shutdown();
    }
}
