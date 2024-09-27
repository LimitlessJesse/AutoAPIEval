import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledFuture;

public class ScheduledThreadPoolExecutor_4 {
    public static void main(String[] args) {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(1);
        
        Runnable task = () -> {
            System.out.println("Executing task...");
        };
        
        ScheduledFuture<?> future = executor.scheduleWithFixedDelay(task, 0, 1, TimeUnit.SECONDS);
        
        try {
            Thread.sleep(5000);
            future.cancel(true);
            executor.shutdown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
