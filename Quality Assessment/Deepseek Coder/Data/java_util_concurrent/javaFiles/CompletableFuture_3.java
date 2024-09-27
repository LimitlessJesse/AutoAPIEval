import java.util.concurrent.CompletableFuture;

public class CompletableFuture_3 {
    public static void main(String[] args) {
        CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
            // Simulate a long running task
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hello, World!";
        });

        future.thenRun(() -> {
            System.out.println("This message is printed after the future completes");
        });

        // The program will not wait for the future to complete here
        // It will immediately exit, demonstrating that the future is run asynchronously
    }
}
