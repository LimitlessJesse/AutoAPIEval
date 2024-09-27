import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;

public class DatagramChannel_6 {
    public static void main(String[] args) {
        try (DatagramChannel channel = DatagramChannel.open()) {
            channel.connect(new InetSocketAddress("localhost", 8080));

            ByteBuffer buffer = ByteBuffer.wrap("Hello, World!".getBytes());
            channel.write(new ByteBuffer[]{buffer});
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
