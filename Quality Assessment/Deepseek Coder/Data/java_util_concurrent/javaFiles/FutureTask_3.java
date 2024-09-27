import java.util.concurrent.FutureTask;

public class FutureTask_3 {
    public static void main(String[] args) {
        FutureTask<String> task = new FutureTask<>(() -> "Hello, World!");
        new Thread(task).start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        boolean isCancelled = task.isCancelled();
        System.out.println("Is task cancelled? " + isCancelled);
    }
}
