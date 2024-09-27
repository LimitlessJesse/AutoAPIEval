import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executors_3 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        
        executor.submit(() -> {
            System.out.println("Task executed by a single thread");
        });
        
        executor.shutdown();
    }
}
