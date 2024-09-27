import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Future;
import java.util.concurrent.Executors;

public class ExecutorCompletionService_1 {
    public static void main(String[] args) {
        ExecutorCompletionService<String> executorCompletionService = new ExecutorCompletionService<>(Executors.newFixedThreadPool(1));
        
        Callable<String> task = () -> {
            Thread.sleep(2000);
            return "Task completed";
        };
        
        Future<String> future = executorCompletionService.submit(task);
        
        try {
            System.out.println(future.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
