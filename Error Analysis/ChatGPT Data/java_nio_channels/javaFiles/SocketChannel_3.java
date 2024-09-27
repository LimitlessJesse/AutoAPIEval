import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;

public class SocketChannel_3 {
    public static void main(String[] args) {
        try {
            SocketChannel socketChannel = SocketChannel.open();
            socketChannel.bind(new InetSocketAddress("localhost", 8080));
            System.out.println("SocketChannel bound to localhost on port 8080");
        } catch (IOException e) {
            System.out.println("Error binding SocketChannel: " + e.getMessage());
        }
    }
}
