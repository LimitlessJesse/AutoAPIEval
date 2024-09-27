import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureTask_1 {
    public static void main(String[] args) {
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() {
                return "Callable task completed";
            }
        };

        FutureTask<String> futureTask = new FutureTask<>(callable);
        futureTask.run();

        try {
            String result = futureTask.get();
            System.out.println("Result: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
