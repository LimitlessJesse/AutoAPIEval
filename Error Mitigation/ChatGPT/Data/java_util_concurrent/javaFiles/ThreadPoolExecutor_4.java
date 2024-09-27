import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolExecutor_4 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 0L, null);
        int activeCount = executor.getActiveCount();
        System.out.println("Active thread count: " + activeCount);
    }
}
