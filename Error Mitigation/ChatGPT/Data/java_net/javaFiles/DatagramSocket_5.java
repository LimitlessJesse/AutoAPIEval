import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DatagramSocket_5 {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            byte[] data = "Hello, World!".getBytes();
            InetAddress address = InetAddress.getByName("localhost");
            int port = 12345;
            DatagramPacket packet = new DatagramPacket(data, data.length, address, port);
            
            socket.send(packet);
            
            System.out.println("Datagram packet sent successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
