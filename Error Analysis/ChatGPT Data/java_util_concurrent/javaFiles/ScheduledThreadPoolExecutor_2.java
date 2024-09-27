import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExecutor_2 {
    public static void main(String[] args) {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(1);

        Runnable task = () -> {
            System.out.println("Task executed at fixed rate");
        };

        long initialDelay = 0;
        long period = 1;
        TimeUnit unit = TimeUnit.SECONDS;

        executor.scheduleAtFixedRate(task, initialDelay, period, unit);
    }
}
