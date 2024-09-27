import java.net.InetSocketAddress;
import java.nio.channels.DatagramChannel;

public class DatagramChannel_3 {
    public static void main(String[] args) {
        try {
            DatagramChannel datagramChannel = DatagramChannel.open();
            datagramChannel.bind(new InetSocketAddress("localhost", 9999));
            System.out.println("Datagram channel bound successfully to port 9999");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
