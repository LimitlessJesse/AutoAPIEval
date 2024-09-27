import java.io.IOException;
import java.nio.channels.ServerSocketChannel;

public class ServerSocketChannel_1 {
    public static void main(String[] args) {
        try {
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            System.out.println("Server socket channel opened successfully");
        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
        }
    }
}
