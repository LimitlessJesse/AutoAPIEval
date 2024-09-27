import java.nio.channels.ServerSocketChannel;
import java.io.IOException;

public class ServerSocketChannel_1 {
    public static void main(String[] args) {
        try {
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            System.out.println("ServerSocketChannel opened successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
