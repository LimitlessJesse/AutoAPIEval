import java.nio.channels.DatagramChannel;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.io.IOException;

public class DatagramChannel_3 {
    public static void main(String[] args) {
        try {
            DatagramChannel channel = DatagramChannel.open();
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            SocketAddress address = channel.receive(buffer);
            System.out.println("Received datagram from: " + address);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
