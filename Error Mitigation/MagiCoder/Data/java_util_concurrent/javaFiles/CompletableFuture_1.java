import java.util.concurrent.CompletableFuture;

public class CompletableFuture_1 {
    public static void main(String[] args) {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            System.out.println("Running in a separate thread");
        });

        future.join();
    }
}
