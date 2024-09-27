import java.net.DatagramPacket;
import java.net.InetAddress;

public class DatagramPacket_3 {
    public static void main(String[] args) {
        try {
            byte[] data = new byte[1024];
            DatagramPacket packet = new DatagramPacket(data, data.length);
            
            // Call getAddress() method to get the InetAddress of the packet
            InetAddress address = packet.getAddress();
            
            // Display the IP address
            System.out.println("IP Address: " + address.getHostAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
