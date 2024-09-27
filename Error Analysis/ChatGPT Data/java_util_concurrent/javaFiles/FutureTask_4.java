import java.util.concurrent.FutureTask;

public class FutureTask_4 {
    public static void main(String[] args) {
        FutureTask<String> futureTask = new FutureTask<>(() -> {
            Thread.sleep(5000); // Simulating a task that takes time to complete
            return "Task completed";
        });

        futureTask.run();

        boolean isTaskDone = futureTask.isDone();
        System.out.println("Task is done: " + isTaskDone);
    }
}
