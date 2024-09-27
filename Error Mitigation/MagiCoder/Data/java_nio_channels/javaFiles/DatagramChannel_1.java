import java.net.InetSocketAddress;
import java.nio.channels.DatagramChannel;
import java.io.IOException;

public class DatagramChannel_1 {
    public static void main(String[] args) {
        try {
            DatagramChannel channel = DatagramChannel.open();
            channel.connect(new InetSocketAddress("localhost", 9999));
            // Further operations can be performed on the channel
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
