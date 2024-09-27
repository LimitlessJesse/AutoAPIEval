import java.net.DatagramPacket;
import java.net.InetAddress;

public class DatagramPacket_5 {
    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            byte[] data = new byte[1024];
            DatagramPacket packet = new DatagramPacket(data, data.length, inetAddress, 1234);
            InetAddress address = packet.getAddress();
            System.out.println("IP Address: " + address.getHostAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
