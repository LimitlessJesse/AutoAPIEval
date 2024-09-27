import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExecutor_3 {
    public static void main(String[] args) {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(1);

        executor.scheduleWithFixedDelay(() -> {
            System.out.println("Executing task at fixed delay");
        }, 0, 1, TimeUnit.SECONDS);
    }
}
