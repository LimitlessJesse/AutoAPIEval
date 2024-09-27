import java.util.concurrent.*;

public class FutureTask_5 {
    public static void main(String[] args) {
        FutureTask<String> futureTask = new FutureTask<>(() -> {
            Thread.sleep(2000);
            return "Hello, World!";
        });

        new Thread(futureTask).start();

        try {
            System.out.println(futureTask.get(1000, TimeUnit.MILLISECONDS));
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            e.printStackTrace();
        }
    }
}
