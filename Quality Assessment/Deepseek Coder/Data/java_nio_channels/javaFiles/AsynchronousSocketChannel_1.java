import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.AsynchronousSocketChannel;

public class AsynchronousSocketChannel_1 {
    public static void main(String[] args) throws IOException {
        AsynchronousSocketChannel client = AsynchronousSocketChannel.open();
        client.connect(new InetSocketAddress("localhost", 8080)).get();
        System.out.println("Connected to localhost:8080");
    }
}
