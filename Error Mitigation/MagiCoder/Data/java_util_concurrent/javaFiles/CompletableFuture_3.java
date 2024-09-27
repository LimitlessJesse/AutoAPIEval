import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class CompletableFuture_3 {
    public static void main(String[] args) {
        CompletableFuture<String> future = new CompletableFuture<>();

        future.thenAccept(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Received: " + s);
            }
        });

        future.complete("Hello, World!");
    }
}
