import java.net.DatagramPacket;
import java.net.InetAddress;

public class DatagramPacket_11 {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("localhost");
            byte[] buf = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buf, buf.length, address, 1234);
            packet.setLength(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
