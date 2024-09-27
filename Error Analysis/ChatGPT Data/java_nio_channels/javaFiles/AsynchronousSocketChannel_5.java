import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.AsynchronousSocketChannel;
import java.util.concurrent.ExecutionException;

public class AsynchronousSocketChannel_5 {
    public static void main(String[] args) {
        try {
            AsynchronousSocketChannel channel = AsynchronousSocketChannel.open();
            channel.bind(new InetSocketAddress("localhost", 8080)).get();
            System.out.println("Socket channel bound successfully");
        } catch (IOException | InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
