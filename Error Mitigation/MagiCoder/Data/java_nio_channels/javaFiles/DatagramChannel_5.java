import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;

public class DatagramChannel_5 {
    public static void main(String[] args) throws IOException {
        DatagramChannel channel = DatagramChannel.open();
        channel.bind(new InetSocketAddress(9999));

        ByteBuffer[] buffers = new ByteBuffer[2];
        buffers[0] = ByteBuffer.allocate(48);
        buffers[1] = ByteBuffer.allocate(48);

        // Read a datagram from the channel
        int bytesRead = channel.read(buffers);

        // Print the number of bytes read
        System.out.println("Bytes read: " + bytesRead);

        // Close the channel
        channel.close();
    }
}
