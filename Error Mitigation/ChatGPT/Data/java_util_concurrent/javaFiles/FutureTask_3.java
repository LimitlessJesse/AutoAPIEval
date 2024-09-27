import java.util.concurrent.FutureTask;

public class FutureTask_3 {
    public static void main(String[] args) {
        FutureTask<String> futureTask = new FutureTask<>(() -> "Result");
        futureTask.cancel(true);
        System.out.println("Task is cancelled: " + futureTask.isCancelled());
    }
}
