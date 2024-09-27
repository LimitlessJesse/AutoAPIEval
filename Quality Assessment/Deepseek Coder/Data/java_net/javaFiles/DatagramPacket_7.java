import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class DatagramPacket_7 {
    public static void main(String[] args) {
        try {
            // Create an InetAddress object
            InetAddress address = InetAddress.getByName("www.example.com");

            // Create a DatagramPacket object
            DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);

            // Set the address of the DatagramPacket
            packet.setAddress(address);

            // Print the address of the DatagramPacket
            System.out.println("Address of the DatagramPacket: " + packet.getAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
