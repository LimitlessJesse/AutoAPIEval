import java.util.concurrent.FutureTask;
import java.util.concurrent.ExecutionException;

public class FutureTask_5 {
    public static void main(String[] args) {
        FutureTask<String> futureTask = new FutureTask<>(() -> {
            Thread.sleep(1000);
            return "Result";
        });

        futureTask.run();

        try {
            String result = futureTask.get();
            System.out.println("Result: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
