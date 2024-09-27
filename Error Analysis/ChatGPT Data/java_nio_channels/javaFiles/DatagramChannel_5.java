import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.net.InetSocketAddress;

public class DatagramChannel_5 {
    public static void main(String[] args) {
        try {
            DatagramChannel channel = DatagramChannel.open();
            ByteBuffer buffer = ByteBuffer.allocate(48);
            buffer.put("Hello, World!".getBytes());
            buffer.flip();
            InetSocketAddress address = new InetSocketAddress("localhost", 8080);
            int bytesSent = channel.send(buffer, address);
            System.out.println("Bytes sent: " + bytesSent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
