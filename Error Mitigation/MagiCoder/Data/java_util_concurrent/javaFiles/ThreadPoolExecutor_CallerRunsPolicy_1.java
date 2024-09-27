import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutor_CallerRunsPolicy_1 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());

        executor.execute(() -> {
            System.out.println("Task 1 executed by " + Thread.currentThread().getName());
        });

        executor.execute(() -> {
            System.out.println("Task 2 executed by " + Thread.currentThread().getName());
        });

        executor.shutdown();
    }
}
