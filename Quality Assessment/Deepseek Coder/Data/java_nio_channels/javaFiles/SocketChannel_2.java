import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class SocketChannel_2 {
    public static void main(String[] args) {
        try {
            SocketChannel socketChannel = SocketChannel.open();
            socketChannel.connect(new InetSocketAddress("example.com", 80));

            String message = "Hello, World!";
            ByteBuffer buffer = ByteBuffer.wrap(message.getBytes());

            int bytesWritten = socketChannel.write(buffer);

            System.out.println("Bytes written: " + bytesWritten);

            socketChannel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
