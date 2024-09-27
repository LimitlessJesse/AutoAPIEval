import java.util.concurrent.CompletableFuture;

public class CompletableFuture_4 {
    public static void main(String[] args) {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            System.out.println("Inside CompletableFuture");
        });

        future.thenAccept(result -> {
            System.out.println("Completed!");
        });
    }
}
