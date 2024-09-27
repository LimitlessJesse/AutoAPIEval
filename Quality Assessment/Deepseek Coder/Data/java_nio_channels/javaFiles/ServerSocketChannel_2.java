import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class ServerSocketChannel_2 {
    public static void main(String[] args) {
        try {
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.bind(new InetSocketAddress(8080));
            serverSocketChannel.configureBlocking(false);

            while (true) {
                SocketChannel socketChannel = serverSocketChannel.accept();
                if (socketChannel!= null) {
                    // Handle the new connection here
                    System.out.println("New connection accepted");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
