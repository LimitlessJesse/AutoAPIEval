import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class AsynchronousSocketChannel_2 {
    public static void main(String[] args) {
        try {
            AsynchronousSocketChannel client = AsynchronousSocketChannel.open();
            Future<Void> future = client.connect(new InetSocketAddress("localhost", 8080));
            future.get(); // Wait for connection to complete

            ByteBuffer buffer = ByteBuffer.allocate(1024);
            Future<Integer> readFuture = client.read(buffer);
            Integer bytesRead = readFuture.get(); // Wait for read operation to complete

            buffer.flip();
            byte[] data = new byte[bytesRead];
            buffer.get(data);

            System.out.println("Received: " + new String(data));

            client.close();
        } catch (IOException | ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
