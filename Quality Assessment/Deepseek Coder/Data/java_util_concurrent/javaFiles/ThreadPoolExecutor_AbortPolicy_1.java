import java.util.concurrent.*;

public class ThreadPoolExecutor_AbortPolicy_1 {
    public static void main(String[] args) {
        // Create a ThreadPoolExecutor with a custom RejectedExecutionHandler
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                2,  // core pool size
                2,  // maximum pool size
                10, // keep alive time
                TimeUnit.SECONDS, // time unit
                new LinkedBlockingQueue<>(2), // work queue
                new ThreadPoolExecutor.AbortPolicy() // RejectedExecutionHandler
        );

        // Submit tasks to the executor
        for (int i = 0; i < 5; i++) {
            final int taskId = i;
            executor.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Executing task " + taskId);
                    try {
                        Thread.sleep(1000); // simulate long running task
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Finished task " + taskId);
                }
            });
        }

        // Shutdown the executor
        executor.shutdown();
    }
}
