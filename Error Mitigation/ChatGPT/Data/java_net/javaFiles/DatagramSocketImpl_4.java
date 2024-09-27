import java.net.DatagramPacket;
import java.net.DatagramSocketImpl;

public class DatagramSocketImpl_4 {
    public static void main(String[] args) {
        DatagramSocketImpl socket = new DatagramSocketImpl();
        DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
        
        try {
            socket.receive(packet);
            System.out.println("Received packet: " + new String(packet.getData()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
