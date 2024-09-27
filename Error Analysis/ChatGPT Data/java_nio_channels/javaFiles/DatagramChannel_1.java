import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;

public class DatagramChannel_1 {
    public static void main(String[] args) {
        try (DatagramChannel channel = DatagramChannel.open()) {
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            buffer.put("Hello, World!".getBytes());
            buffer.flip();
            channel.send(buffer, new InetSocketAddress("localhost", 8080));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
