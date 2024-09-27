import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executors_4 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(() -> {
            System.out.println("Task executed by thread: " + Thread.currentThread().getName());
        });
        executorService.shutdown();
    }
}
