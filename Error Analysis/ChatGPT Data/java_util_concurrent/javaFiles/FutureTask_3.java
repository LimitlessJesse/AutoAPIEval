import java.util.concurrent.*;

public class FutureTask_3 {
    public static void main(String[] args) {
        FutureTask<Integer> task = new FutureTask<>(() -> {
            Thread.sleep(2000);
            return 42;
        });
        
        task.cancel(true);
        
        System.out.println(task.isCancelled()); // Output: true
    }
}
