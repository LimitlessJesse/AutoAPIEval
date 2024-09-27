import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolExecutor_5 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 0, null);
        boolean isShutdown = executor.isShutdown();
        System.out.println("Executor is shutdown: " + isShutdown);
    }
}
