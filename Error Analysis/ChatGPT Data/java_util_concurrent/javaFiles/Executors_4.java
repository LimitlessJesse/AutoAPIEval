import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Executors_4 {
    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        
        executor.schedule(() -> System.out.println("Task executed"), 5, TimeUnit.SECONDS);

        executor.shutdown();
    }
}
