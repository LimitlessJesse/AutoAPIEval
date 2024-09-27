import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuture_5 {
    public static void main(String[] args) {
        CompletableFuture<String> future = new CompletableFuture<>();

        future.whenComplete((result, exception) -> {
            if (exception!= null) {
                System.out.println("An error occurred: " + exception.getMessage());
            } else {
                System.out.println("The result is: " + result);
            }
        });

        // Simulate some asynchronous operation
        new Thread(() -> {
            try {
                Thread.sleep(2000);
                future.complete("Hello, World!");
            } catch (InterruptedException e) {
                future.completeExceptionally(e);
            }
        }).start();

        try {
            System.out.println(future.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
