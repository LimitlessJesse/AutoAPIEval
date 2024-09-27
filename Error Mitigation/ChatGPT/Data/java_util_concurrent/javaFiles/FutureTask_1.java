import java.util.concurrent.FutureTask;

public class FutureTask_1 {
    public static void main(String[] args) {
        FutureTask<String> futureTask = new FutureTask<>(() -> {
            return "Task completed";
        });

        futureTask.run();
    }
}
