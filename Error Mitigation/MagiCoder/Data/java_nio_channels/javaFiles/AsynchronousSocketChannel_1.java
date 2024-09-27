import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;

public class AsynchronousSocketChannel_1 {
    public static void main(String[] args) throws IOException {
        AsynchronousServerSocketChannel serverChannel = AsynchronousServerSocketChannel.open();
        serverChannel.bind(new InetSocketAddress(8080));

        AsynchronousSocketChannel clientChannel = serverChannel.accept();

        AsynchronousSocketChannel socketChannel = AsynchronousSocketChannel.open();
        socketChannel.connect(new InetSocketAddress("localhost", 8080));
    }
}
