import java.net.DatagramPacket;
import java.net.InetAddress;

public class DatagramPacket_4 {
    public static void main(String[] args) throws Exception {
        // Create a DatagramPacket
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length, InetAddress.getLocalHost(), 4445);

        // Get the length of the data
        int length = packet.getLength();
        System.out.println("Length of the data: " + length);
    }
}
