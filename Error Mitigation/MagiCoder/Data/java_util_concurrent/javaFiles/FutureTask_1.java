import java.util.concurrent.FutureTask;

public class FutureTask_1 {
    public static void main(String[] args) {
        FutureTask<String> futureTask = new FutureTask<>(() -> "Hello");
        Thread thread = new Thread(futureTask);
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        boolean cancelled = futureTask.cancel(true);
        System.out.println("Task cancelled: " + cancelled);
    }
}
