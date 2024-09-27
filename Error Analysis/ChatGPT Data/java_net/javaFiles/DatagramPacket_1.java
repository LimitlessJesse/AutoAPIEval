import java.net.DatagramPacket;

public class DatagramPacket_1 {
    public static void main(String[] args) {
        byte[] buffer = new byte[1024];
        
        // Create a DatagramPacket object
        DatagramPacket datagramPacket = new DatagramPacket(buffer, buffer.length);
        
        // Set data using setData method
        datagramPacket.setData("Hello, World!".getBytes());
        
        System.out.println("Data set in DatagramPacket: " + new String(datagramPacket.getData()));
    }
}
