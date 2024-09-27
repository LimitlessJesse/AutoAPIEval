import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public class CompletableFuture_2 {
    public static void main(String[] args) {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Hello");

        Function<String, String> function = s -> s + " World";

        CompletableFuture<String> newFuture = future.thenApply(function);

        newFuture.thenAccept(System.out::println);
    }
}
