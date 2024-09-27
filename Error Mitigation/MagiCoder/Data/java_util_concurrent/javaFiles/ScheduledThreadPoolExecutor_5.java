import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExecutor_5 {
    public static void main(String[] args) {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(1);

        // Schedule a task to run after 10 seconds
        executor.schedule(() -> System.out.println("Task executed after 10 seconds"), 10, TimeUnit.SECONDS);

        // Shut down the executor
        executor.shutdown();
    }
}
