import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;

public class DatagramChannel_2 {
    public static void main(String[] args) {
        try {
            DatagramChannel channel = DatagramChannel.open();
            ByteBuffer buffer = ByteBuffer.wrap("Hello, World!".getBytes());
            InetSocketAddress target = new InetSocketAddress("localhost", 8080);
            int bytesSent = channel.send(buffer, target);
            System.out.println("Bytes sent: " + bytesSent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
