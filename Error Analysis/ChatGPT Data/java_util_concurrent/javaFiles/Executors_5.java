import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executors_5 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        
        executor.execute(() -> {
            System.out.println("Task executed by newCachedThreadPool");
        });
        
        executor.shutdown();
    }
}
