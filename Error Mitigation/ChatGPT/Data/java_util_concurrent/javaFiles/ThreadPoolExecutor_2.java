import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolExecutor_2 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 0L, null);
        List<Runnable> tasks = executor.shutdownNow();
        System.out.println("Tasks that never commenced execution: " + tasks);
    }
}
