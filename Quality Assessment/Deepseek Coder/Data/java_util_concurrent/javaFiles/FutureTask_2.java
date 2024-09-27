import java.util.concurrent.FutureTask;

public class FutureTask_2 {
    public static void main(String[] args) {
        FutureTask<String> futureTask = new FutureTask<>(() -> {
            // Simulate a long running task
            Thread.sleep(1000);
            return "Task completed";
        });

        Thread thread = new Thread(futureTask);
        thread.start();

        // Cancel the task
        boolean cancelled = futureTask.cancel(true);
        System.out.println("Task cancelled: " + cancelled);
    }
}
