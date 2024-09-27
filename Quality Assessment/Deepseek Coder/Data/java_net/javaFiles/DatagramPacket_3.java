import java.net.DatagramPacket;

public class DatagramPacket_3 {
    public static void main(String[] args) {
        byte[] buffer = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        int length = packet.getLength();
        System.out.println("Length of the packet: " + length);
    }
}
