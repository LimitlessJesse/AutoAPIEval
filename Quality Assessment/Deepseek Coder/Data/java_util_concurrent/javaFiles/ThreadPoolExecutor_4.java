import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingQueue;

public class ThreadPoolExecutor_4 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, java.util.concurrent.TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());
        executor.execute(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Task completed");
            }
        });

        System.out.println("Is executor shutdown? " + executor.isShutdown());
        executor.shutdown();
        System.out.println("Is executor shutdown? " + executor.isShutdown());
    }
}
