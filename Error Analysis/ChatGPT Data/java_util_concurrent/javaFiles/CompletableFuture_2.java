import java.util.concurrent.CompletableFuture;

public class CompletableFuture_2 {
    public static void main(String[] args) {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            // This code will run asynchronously
            System.out.println("Hello from CompletableFuture.runAsync");
        });

        future.join(); // Wait for the asynchronous task to complete
    }
}
