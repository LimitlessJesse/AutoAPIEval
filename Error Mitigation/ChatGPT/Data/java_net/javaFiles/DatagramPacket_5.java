import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.SocketAddress;

public class DatagramPacket_5 {
    public static void main(String[] args) {
        try {
            byte[] data = new byte[1024];
            DatagramPacket packet = new DatagramPacket(data, data.length);
            SocketAddress address = packet.getSocketAddress();
            System.out.println("Socket Address: " + address);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
