import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExecutor_3 {
    public static void main(String[] args) {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(1);

        Runnable task = new Runnable() {
            public void run() {
                System.out.println("Running task at " + System.currentTimeMillis());
            }
        };

        // Schedule the task to run every 2 seconds, with an initial delay of 1 second
        executor.scheduleWithFixedDelay(task, 1, 2, TimeUnit.SECONDS);
    }
}
