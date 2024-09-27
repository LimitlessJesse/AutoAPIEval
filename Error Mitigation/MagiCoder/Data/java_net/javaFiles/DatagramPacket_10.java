import java.net.DatagramPacket;
import java.net.InetAddress;

public class DatagramPacket_10 {
    public static void main(String[] args) throws Exception {
        // Create a datagram packet
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);

        // Set the port number
        int port = 8080;
        packet.setPort(port);

        // Get the port number
        int receivedPort = packet.getPort();
        System.out.println("Received port: " + receivedPort);
    }
}
