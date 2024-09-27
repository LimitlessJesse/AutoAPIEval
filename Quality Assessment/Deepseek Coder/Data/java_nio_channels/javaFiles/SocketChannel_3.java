import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;

public class SocketChannel_3 {
    public static void main(String[] args) {
        try {
            SocketChannel socketChannel = SocketChannel.open();
            InetSocketAddress remote = new InetSocketAddress("www.example.com", 80);
            boolean connected = socketChannel.connect(remote);
            
            if (connected) {
                System.out.println("Connected to " + remote);
            } else {
                System.out.println("Failed to connect to " + remote);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
