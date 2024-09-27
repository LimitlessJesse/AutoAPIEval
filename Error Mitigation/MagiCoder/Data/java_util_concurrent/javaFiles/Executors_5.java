import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executors_5 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newWorkStealingPool(5);
        executorService.shutdown();
    }
}
