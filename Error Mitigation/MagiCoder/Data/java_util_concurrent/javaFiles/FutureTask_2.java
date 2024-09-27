import java.util.concurrent.FutureTask;

public class FutureTask_2 {
    public static void main(String[] args) {
        FutureTask<String> futureTask = new FutureTask<>(() -> "Hello");
        Thread thread = new Thread(futureTask);
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (futureTask.isCancelled()) {
            System.out.println("Task was cancelled");
        } else {
            System.out.println("Task was not cancelled");
        }
    }
}
