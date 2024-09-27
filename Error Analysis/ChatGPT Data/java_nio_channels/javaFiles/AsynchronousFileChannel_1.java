import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.util.concurrent.CompletableFuture;

public class AsynchronousFileChannel_1 {
    public static void main(String[] args) {
        AsynchronousFileChannel fileChannel = null; // Initialize with your file channel
        ByteBuffer buffer = ByteBuffer.allocate(1024); // Allocate buffer size as needed
        long position = 0; // Specify the position to read from
        
        CompletableFuture<Integer> future = new CompletableFuture<>();
        
        fileChannel.read(buffer, position, null, new CompletionHandler<Integer, Void>() {
            @Override
            public void completed(Integer result, Void attachment) {
                future.complete(result);
            }

            @Override
            public void failed(Throwable exc, Void attachment) {
                future.completeExceptionally(exc);
            }
        });
        
        future.thenAccept(result -> {
            System.out.println("Bytes read: " + result);
            buffer.flip();
            System.out.println("Data read: " + new String(buffer.array()));
        });
    }
}
