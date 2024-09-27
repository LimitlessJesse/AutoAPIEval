import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.Executors;

public class ThreadPoolExecutor_1 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(1);
        
        executor.execute(new Runnable() {
            public void run() {
                System.out.println("Asynchronous task is running...");
            }
        });
        
        executor.shutdown();
    }
}
