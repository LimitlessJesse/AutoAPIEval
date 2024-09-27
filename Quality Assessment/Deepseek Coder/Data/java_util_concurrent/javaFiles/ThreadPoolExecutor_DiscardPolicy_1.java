import java.util.concurrent.*;

public class ThreadPoolExecutor_DiscardPolicy_1 {
    public static void main(String[] args) {
        // Create a ThreadPoolExecutor with a custom RejectedExecutionHandler
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                1, 1, 1, TimeUnit.MINUTES,
                new LinkedBlockingQueue<>(),
                new ThreadPoolExecutor.DiscardPolicy() {
                    @Override
                    public void rejectedExecution(Runnable r, ThreadPoolExecutor e) {
                        System.out.println("Task " + r + " was rejected from " + e);
                    }
                });

        // Submit a task to the executor
        executor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running task");
            }
        });

        // Submit another task to the executor
        executor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running another task");
            }
        });

        // Shutdown the executor
        executor.shutdown();
    }
}
