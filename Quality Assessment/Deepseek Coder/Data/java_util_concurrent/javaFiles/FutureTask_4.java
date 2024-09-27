import java.util.concurrent.FutureTask;

public class FutureTask_4 {
    public static void main(String[] args) {
        FutureTask<String> futureTask = new FutureTask<>(() -> "Hello, World!");
        new Thread(futureTask).start();

        // Check if the task is done
        boolean isDone = futureTask.isDone();
        System.out.println("Is the task done? " + isDone);

        // Get the result of the task
        try {
            String result = futureTask.get();
            System.out.println("Result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
