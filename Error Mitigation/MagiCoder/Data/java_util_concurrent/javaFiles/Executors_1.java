import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executors_1 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            int taskNumber = i;
            executorService.execute(() -> {
                String message = Thread.currentThread().getName() + " is executing task " + taskNumber;
                System.out.println(message);
            });
        }
        executorService.shutdown();
    }
}
