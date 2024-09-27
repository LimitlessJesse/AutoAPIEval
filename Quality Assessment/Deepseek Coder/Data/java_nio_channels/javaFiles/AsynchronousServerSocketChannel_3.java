import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.AsynchronousServerSocketChannel;

public class AsynchronousServerSocketChannel_3 {
    public static void main(String[] args) {
        try {
            // Create an AsynchronousServerSocketChannel
            AsynchronousServerSocketChannel serverChannel = AsynchronousServerSocketChannel.open();

            // Bind the server to a port
            InetSocketAddress address = new InetSocketAddress(8080);
            serverChannel.bind(address);

            System.out.println("Server is listening on port " + address.getPort());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
