import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class CompletableFuture_1 {
    public static void main(String[] args) {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(new Supplier<Integer>() {
            @Override
            public Integer get() {
                return 42; // return any value you want
            }
        });

        try {
            System.out.println("Result of CompletableFuture: " + future.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
