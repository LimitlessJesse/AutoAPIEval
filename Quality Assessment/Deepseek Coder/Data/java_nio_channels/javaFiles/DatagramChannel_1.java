import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.DatagramChannel;

public class DatagramChannel_1 {
    public static void main(String[] args) {
        try {
            DatagramChannel channel = DatagramChannel.open();
            channel.bind(new InetSocketAddress(9999));
            System.out.println("Channel is open: " + channel.isOpen());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
