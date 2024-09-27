import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;

public class CompletableFuture_4 {
    public static void main(String[] args) {
        CompletableFuture<String> future = CompletableFuture.completedFuture("Hello");

        CompletableFuture<Void> thenAcceptFuture = future.thenAccept(result -> {
            System.out.println("Received result: " + result);
        });

        try {
            thenAcceptFuture.get(); // Wait for the completion of the thenAccept action
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
