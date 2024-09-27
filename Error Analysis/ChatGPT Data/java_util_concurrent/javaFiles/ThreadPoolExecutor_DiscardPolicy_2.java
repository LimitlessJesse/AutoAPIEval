import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutor_DiscardPolicy_2 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 0, TimeUnit.SECONDS, new ThreadPoolExecutor.DiscardPolicy());

        executor.execute(() -> {
            System.out.println("Task executing");
        });

    }

    static void rejectedExecution(Runnable r, ThreadPoolExecutor e) {
        RejectedExecutionHandler handler = e.getRejectedExecutionHandler();
        handler.rejectedExecution(r, e);
    }
}
