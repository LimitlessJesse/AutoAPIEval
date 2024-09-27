import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;

public class CompletableFuture_2 {
    public static void main(String[] args) {
        CompletableFuture<Integer> future = new CompletableFuture<>();
        
        CompletableFuture<Integer> exceptionallyFuture = future.exceptionally((ex) -> {
            System.out.println("Exception occurred: " + ex.getMessage());
            return 0; // default value to return in case of exception
        });
        
        future.completeExceptionally(new RuntimeException("Something went wrong"));
        
        try {
            System.out.println("Result: " + exceptionallyFuture.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
