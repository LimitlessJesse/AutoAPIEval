import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.DatagramChannel;

public class DatagramChannel_4 {
    public static void main(String[] args) {
        try {
            DatagramChannel channel = DatagramChannel.open();
            channel.connect(new InetSocketAddress("example.com", 80));
            System.out.println(channel.getRemoteAddress());
            channel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
