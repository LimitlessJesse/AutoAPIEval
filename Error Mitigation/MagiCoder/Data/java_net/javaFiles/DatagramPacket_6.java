import java.net.DatagramPacket;
import java.net.InetAddress;

public class DatagramPacket_6 {
    public static void main(String[] args) throws Exception {
        // Create a DatagramPacket
        InetAddress address = InetAddress.getByName("localhost");
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length, address, 1234);

        // Get the port number
        int port = packet.getPort();
        System.out.println("Port number: " + port);
    }
}
