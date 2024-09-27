import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class SocketChannel_4 {
    public static void main(String[] args) throws IOException {
        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.connect(new InetSocketAddress("localhost", 8080));

        String message = "Hello, World!";
        ByteBuffer buffer = ByteBuffer.wrap(message.getBytes());

        while(buffer.hasRemaining()) {
            socketChannel.write(buffer);
        }

        socketChannel.close();
    }
}
