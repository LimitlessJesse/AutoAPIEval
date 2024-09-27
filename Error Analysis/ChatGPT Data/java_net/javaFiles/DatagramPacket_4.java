import java.net.DatagramPacket;

public class DatagramPacket_4 {
    public static void main(String[] args) {
        byte[] data = new byte[10];
        DatagramPacket packet = new DatagramPacket(data, data.length);
        int port = packet.getPort();
        System.out.println("Port: " + port);
    }
}
