import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executors_3 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new Task());
        executorService.shutdown();
    }
}

class Task implements Runnable {
    @Override
    public void run() {
        System.out.println("Task executed by " + Thread.currentThread().getName());
    }
}
