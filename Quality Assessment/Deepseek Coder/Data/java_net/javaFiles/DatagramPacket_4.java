import java.net.DatagramPacket;

public class DatagramPacket_4 {
    public static void main(String[] args) {
        byte[] buffer = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        packet.setLength(5); // Setting the length of the packet to 5
        System.out.println("Length of the packet: " + packet.getLength());
    }
}
