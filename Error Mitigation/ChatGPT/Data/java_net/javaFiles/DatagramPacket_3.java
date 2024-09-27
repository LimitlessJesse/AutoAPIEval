import java.net.DatagramPacket;

public class DatagramPacket_3 {
    public static void main(String[] args) {
        byte[] data = new byte[10];
        DatagramPacket packet = new DatagramPacket(data, data.length);
        
        // Set the length of the packet
        int length = 5;
        packet.setLength(length);
        
        System.out.println("Packet length set to: " + packet.getLength());
    }
}
