import java.net.DatagramPacket;

public class DatagramPacket_1 {
    public static void main(String[] args) {
        byte[] data = "Hello, World!".getBytes();
        DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
        
        packet.setData(data);
        
        System.out.println("Data set for DatagramPacket: " + new String(packet.getData()));
    }
}
