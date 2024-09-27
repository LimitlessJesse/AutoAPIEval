import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;

public class DatagramChannel_3 {
    public static void main(String[] args) {
        try {
            DatagramChannel channel = DatagramChannel.open();
            InetSocketAddress address = new InetSocketAddress("localhost", 9999);
            String msg = "Hello, World!";
            ByteBuffer buffer = ByteBuffer.wrap(msg.getBytes());

            int bytesWritten = channel.send(buffer, address);

            System.out.println("Sent " + bytesWritten + " bytes to " + address);

            channel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
