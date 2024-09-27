import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class Executors_2 {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutor = Executors.newScheduledThreadPool(5);
        // Use the scheduledExecutor for scheduling tasks
    }
}
