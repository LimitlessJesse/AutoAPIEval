import java.io.IOException;
import java.nio.channels.ServerSocketChannel;

public class ServerSocketChannel_1 {
    public static void main(String[] args) {
        try {
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            System.out.println("ServerSocketChannel opened successfully");
        } catch (IOException e) {
            System.err.println("Error opening ServerSocketChannel: " + e.getMessage());
        }
    }
}
