import java.net.DatagramPacket;
import java.net.InetAddress;

public class DatagramPacket_9 {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("localhost");
            byte[] buf = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buf, buf.length, address, 4445);
            packet.setAddress(address);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
