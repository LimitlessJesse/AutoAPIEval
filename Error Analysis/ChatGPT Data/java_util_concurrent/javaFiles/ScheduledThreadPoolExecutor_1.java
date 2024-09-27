import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExecutor_1 {
    public static void main(String[] args) {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(1);

        Runnable task = () -> System.out.println("Task executed");

        executor.schedule(task, 5, TimeUnit.SECONDS);
    }
}
