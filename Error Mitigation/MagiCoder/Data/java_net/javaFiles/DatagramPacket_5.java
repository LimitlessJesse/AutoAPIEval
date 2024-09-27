import java.net.DatagramPacket;
import java.net.InetAddress;

public class DatagramPacket_5 {
    public static void main(String[] args) throws Exception {
        // Create a DatagramPacket
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);

        // Get the IP address of the machine to which this datagram is being sent
        InetAddress address = packet.getAddress();
        System.out.println("IP address: " + address.getHostAddress());
    }
}
