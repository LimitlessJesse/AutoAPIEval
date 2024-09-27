import java.io.IOException;
import java.nio.channels.SocketChannel;

public class SocketChannel_1 {
    public static void main(String[] args) {
        try {
            SocketChannel socketChannel = SocketChannel.open();
            System.out.println("Socket channel opened successfully: " + socketChannel);
        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
        }
    }
}
