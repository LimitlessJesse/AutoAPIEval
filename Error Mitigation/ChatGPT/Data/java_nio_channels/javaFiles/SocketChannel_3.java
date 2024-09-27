import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class SocketChannel_3 {
    public static void main(String[] args) {
        try {
            SocketChannel socketChannel = SocketChannel.open();
            socketChannel.connect(new InetSocketAddress("example.com", 80));

            ByteBuffer buffer = ByteBuffer.allocate(1024);
            int bytesRead = socketChannel.read(buffer);

            System.out.println("Number of bytes read: " + bytesRead);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
