import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executors_2 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            final int index = i;
            executorService.execute(new Runnable() {
                public void run() {
                    System.out.println(Thread.currentThread().getName() + " is running, task = " + index);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        executorService.shutdown();
    }
}
