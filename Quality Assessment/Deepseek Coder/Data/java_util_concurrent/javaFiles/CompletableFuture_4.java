import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public class CompletableFuture_4 {
    public static void main(String[] args) {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            // Simulate a failure
            if (Math.random() < 0.5) {
                throw new RuntimeException("Failed");
            }
            return "Success";
        });

        Function<Throwable, String> exceptionHandler = ex -> "Handled exception: " + ex.getMessage();

        String result = future.exceptionally(exceptionHandler).join();
        System.out.println(result);
    }
}
