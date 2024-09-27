import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolExecutor_1 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 0, null, null);
        executor.execute(() -> {
            System.out.println("Executing command...");
        });
    }
}
