import java.net.DatagramPacket;
import java.net.DatagramSocketImpl;

public class DatagramSocketImpl_3 {
    public static void main(String[] args) {
        // Create a DatagramPacket
        byte[] data = "Hello, World!".getBytes();
        DatagramPacket packet = new DatagramPacket(data, data.length);

        // Create a DatagramSocketImpl
        DatagramSocketImpl socketImpl = new DatagramSocketImpl();

        // Send the DatagramPacket
        try {
            socketImpl.send(packet);
            System.out.println("DatagramPacket sent successfully.");
        } catch (Exception e) {
            System.out.println("Error sending DatagramPacket: " + e.getMessage());
        }
    }
}
