import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class AsynchronousSocketChannel_3 {
    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
        AsynchronousSocketChannel client = AsynchronousSocketChannel.open();
        Future<Void> future = client.connect(new InetSocketAddress("localhost", 8080));
        future.get(); // Wait for the connection to complete

        String message = "Hello, Server!";
        ByteBuffer buffer = ByteBuffer.wrap(message.getBytes());
        Future<Integer> writeFuture = client.write(buffer);

        // Wait for the write operation to complete
        Integer bytesWritten = writeFuture.get();
        System.out.println("Bytes written: " + bytesWritten);

        client.close();
    }
}
