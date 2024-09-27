import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executors_5 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        ExecutorService unconfigurableExecutor = Executors.unconfigurableExecutorService(executor);
        // Now you can use unconfigurableExecutor to safely "freeze" configuration
    }
}
