import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolExecutor_5 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
        System.out.println("Is executor shutdown? " + executor.isShutdown());
        executor.shutdown();
        System.out.println("Is executor shutdown? " + executor.isShutdown());
    }
}
