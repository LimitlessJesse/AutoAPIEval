import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.SocketAddress;

public class DatagramPacket_5 {
    public static void main(String[] args) {
        try {
            // Create a DatagramPacket
            byte[] data = "Hello, World!".getBytes();
            InetAddress address = InetAddress.getByName("localhost");
            int port = 12345;
            DatagramPacket packet = new DatagramPacket(data, data.length, address, port);
            
            // Set the socket address
            SocketAddress newAddress = packet.getSocketAddress();
            packet.setSocketAddress(newAddress);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
