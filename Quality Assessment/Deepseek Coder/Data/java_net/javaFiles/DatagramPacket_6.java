import java.net.DatagramPacket;
import java.net.InetAddress;

public class DatagramPacket_6 {
    public static void main(String[] args) {
        try {
            // Create a DatagramSocket
            // InetAddress.getByName("localhost") represents the IP address of the machine
            // 8000 is the port number
            DatagramPacket packet = new DatagramPacket(new byte[1024], 1024, InetAddress.getByName("localhost"), 8000);
            
            // Get the port number from the DatagramPacket
            int port = packet.getPort();
            
            // Print the port number
            System.out.println("Port number: " + port);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
