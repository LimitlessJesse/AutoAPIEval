import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class Executors_3 {
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(10);
        executorService.shutdown();
    }
}
