import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;

public class SocketChannel_4 {
    public static void main(String[] args) {
        try {
            SocketChannel socketChannel = SocketChannel.open();
            socketChannel.bind(new InetSocketAddress("localhost", 8080));
            System.out.println("Socket bound successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
