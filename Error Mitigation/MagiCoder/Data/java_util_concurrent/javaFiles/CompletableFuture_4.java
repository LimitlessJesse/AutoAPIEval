import java.util.concurrent.CompletableFuture;

public class CompletableFuture_4 {
    public static void main(String[] args) {
        CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
            // Some computation here
            return null;
        });

        future.thenRun(() -> {
            // This action will be performed when the future completes
            System.out.println("Future completed!");
        });
    }
}
