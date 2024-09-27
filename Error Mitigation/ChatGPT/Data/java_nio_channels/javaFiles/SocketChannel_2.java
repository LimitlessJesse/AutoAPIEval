import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class SocketChannel_2 {
    public static void main(String[] args) {
        try {
            SocketChannel socketChannel = SocketChannel.open();
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            buffer.put("Hello, World!".getBytes());
            buffer.flip();
            int bytesWritten = socketChannel.write(buffer);
            System.out.println("Number of bytes written: " + bytesWritten);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
