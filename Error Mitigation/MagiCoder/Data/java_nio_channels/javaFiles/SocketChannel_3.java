import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class SocketChannel_3 {
    public static void main(String[] args) {
        try (SocketChannel socketChannel = SocketChannel.open()) {
            socketChannel.connect(new InetSocketAddress("localhost", 8080));

            ByteBuffer buffer = ByteBuffer.allocate(1024);
            int bytesRead = socketChannel.read(buffer);

            if (bytesRead!= -1) {
                buffer.flip();
                byte[] byteArray = new byte[bytesRead];
                buffer.get(byteArray);
                System.out.println(new String(byteArray));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
