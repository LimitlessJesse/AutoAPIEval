import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolExecutor_1 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
        
        executor.execute(() -> {
            System.out.println("Task executed by ThreadPoolExecutor");
        });
        
        executor.shutdown();
    }
}
