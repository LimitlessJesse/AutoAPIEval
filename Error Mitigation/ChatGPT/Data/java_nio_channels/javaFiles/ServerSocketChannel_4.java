import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;

public class ServerSocketChannel_4 {
    public static void main(String[] args) {
        try {
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.bind(new InetSocketAddress("localhost", 8080));
            System.out.println("ServerSocketChannel bound to localhost:8080");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
