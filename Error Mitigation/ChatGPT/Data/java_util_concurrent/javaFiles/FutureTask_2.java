import java.util.concurrent.FutureTask;

public class FutureTask_2 {
    public static void main(String[] args) {
        FutureTask<String> futureTask = new FutureTask<>(() -> {
            Thread.sleep(5000);
            return "Task completed";
        });

        futureTask.cancel(true);
    }
}
