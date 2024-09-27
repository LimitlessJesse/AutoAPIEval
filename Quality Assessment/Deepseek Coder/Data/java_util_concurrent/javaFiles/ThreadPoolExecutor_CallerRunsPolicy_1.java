import java.util.concurrent.*;

public class ThreadPoolExecutor_CallerRunsPolicy_1 {
    public static void main(String[] args) {
        // Create a ThreadPoolExecutor with a custom RejectedExecutionHandler
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                1, 1, 1, TimeUnit.MINUTES,
                new LinkedBlockingQueue<>(),
                new ThreadPoolExecutor.CallerRunsPolicy() {
                    @Override
                    public void rejectedExecution(Runnable r, ThreadPoolExecutor e) {
                        System.out.println("Task " + r + " is rejected from " + e);
                    }
                });

        // Submit tasks to the executor
        for (int i = 0; i < 5; i++) {
            final int taskId = i;
            executor.submit(() -> {
                System.out.println("Start task " + taskId);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("End task " + taskId);
            });
        }

        // Shutdown the executor
        executor.shutdown();
    }
}
