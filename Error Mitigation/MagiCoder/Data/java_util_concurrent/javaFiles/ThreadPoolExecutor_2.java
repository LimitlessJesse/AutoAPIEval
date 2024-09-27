import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutor_2 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
        int maxPoolSize = executor.getMaximumPoolSize();
        System.out.println("Maximum Pool Size: " + maxPoolSize);
        executor.shutdown();
    }
}
