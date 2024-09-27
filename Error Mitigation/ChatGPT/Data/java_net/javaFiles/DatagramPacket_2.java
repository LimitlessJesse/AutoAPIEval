import java.net.DatagramPacket;

public class DatagramPacket_2 {
    public static void main(String[] args) {
        byte[] data = new byte[10];
        DatagramPacket packet = new DatagramPacket(data, data.length);
        
        byte[] receivedData = packet.getData();
        System.out.println("Data received: " + new String(receivedData));
    }
}
