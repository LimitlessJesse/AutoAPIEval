import java.net.DatagramPacket;
import java.net.InetAddress;

public class DatagramPacket_8 {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("localhost");
            byte[] buf = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buf, buf.length, address, 1234);
            packet.setPort(5678); // Set the port to 5678
            System.out.println("New port: " + packet.getPort()); // Prints: New port: 5678
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
