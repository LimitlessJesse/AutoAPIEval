import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolExecutor_5 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 0L, null, null);
        boolean terminated = executor.isTerminated();
        System.out.println("Is Executor Terminated: " + terminated);
    }
}
