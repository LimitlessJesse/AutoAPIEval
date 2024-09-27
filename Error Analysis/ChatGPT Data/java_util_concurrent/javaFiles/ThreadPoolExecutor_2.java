import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutor_2 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(1));
        
        executor.execute(() -> {
            System.out.println("Task 1 is running");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task 1 completed");
        });
        executor.execute(() -> {
            System.out.println("Task 2 is running");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task 2 completed");
        });
        
        executor.shutdownNow();
        
        System.out.println("Executor is shut down");
    }
}
