import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executors_2 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.shutdown();
    }
}
