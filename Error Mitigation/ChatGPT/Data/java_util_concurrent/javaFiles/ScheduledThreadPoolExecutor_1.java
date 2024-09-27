import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledFuture;

public class ScheduledThreadPoolExecutor_1 {
    public static void main(String[] args) {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(1);
        
        Runnable task = () -> {
            System.out.println("Task executed after delay");
        };
        
        ScheduledFuture<?> future = executor.schedule(task, 5, TimeUnit.SECONDS);
        
        try {
            future.get(); // Wait for the task to complete
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        executor.shutdown();
    }
}
