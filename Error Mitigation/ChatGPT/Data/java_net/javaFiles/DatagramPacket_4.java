import java.net.DatagramPacket;

public class DatagramPacket_4 {
    public static void main(String[] args) {
        byte[] data = new byte[10];
        DatagramPacket packet = new DatagramPacket(data, data.length);
        int length = packet.getLength();
        System.out.println("Length of data: " + length);
    }
}
