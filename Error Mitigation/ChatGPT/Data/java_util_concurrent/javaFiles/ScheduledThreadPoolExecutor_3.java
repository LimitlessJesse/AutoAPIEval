import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledFuture;

public class ScheduledThreadPoolExecutor_3 {
    public static void main(String[] args) {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(1);
        
        // Define the task to be executed
        Runnable task = () -> {
            System.out.println("Task executed at: " + System.currentTimeMillis());
        };
        
        // Schedule the task to run after an initial delay of 1 second and then every 2 seconds
        ScheduledFuture<?> future = executor.scheduleAtFixedRate(task, 1, 2, TimeUnit.SECONDS);
        
        // Shutdown the executor after 10 seconds
        executor.schedule(() -> {
            executor.shutdown();
        }, 10, TimeUnit.SECONDS);
    }
}
