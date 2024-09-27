import java.util.concurrent.ScheduledThreadPoolExecutor;

public class ScheduledThreadPoolExecutor_5 {
    public static void main(String[] args) {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(1);
        executor.setContinueExistingPeriodicTasksAfterShutdownPolicy(true);
        System.out.println("Continue existing periodic tasks after shutdown policy set to true");
    }
}
