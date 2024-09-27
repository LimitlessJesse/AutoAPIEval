import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Executors_4 {
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);

        Runnable task = new Runnable() {
            public void run() {
                System.out.println("Scheduled task executed");
            }
        };

        // Schedule the task to run after 5 seconds delay
        executorService.schedule(task, 5, TimeUnit.SECONDS);

        // Shutdown the executor service
        executorService.shutdown();
    }
}
