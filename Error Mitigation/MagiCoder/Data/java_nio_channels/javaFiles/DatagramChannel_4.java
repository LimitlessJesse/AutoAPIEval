import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;

public class DatagramChannel_4 {
    public static void main(String[] args) throws IOException {
        DatagramChannel channel = DatagramChannel.open();
        String message = "Hello, World!";
        ByteBuffer buffer = ByteBuffer.wrap(message.getBytes());
        InetSocketAddress address = new InetSocketAddress("localhost", 8080);
        channel.send(buffer, address);
        channel.close();
    }
}
