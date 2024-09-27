import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AsynchronousServerSocketChannel_4 {
    public static void main(String[] args) {
        try {
            ExecutorService executor = Executors.newFixedThreadPool(10);
            AsynchronousServerSocketChannel serverSocket = AsynchronousServerSocketChannel.open(executor);
            serverSocket.bind(new InetSocketAddress("localhost", 8080));
            
            // Further code logic for using the server socket
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
