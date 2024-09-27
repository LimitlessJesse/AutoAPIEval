import java.util.concurrent.FutureTask;

public class FutureTask_4 {
    public static void main(String[] args) {
        FutureTask<Boolean> futureTask = new FutureTask<>(() -> true);
        boolean done = futureTask.isDone();
        System.out.println("Task is done: " + done);
    }
}
