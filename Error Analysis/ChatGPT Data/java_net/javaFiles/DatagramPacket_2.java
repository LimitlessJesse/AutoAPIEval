import java.net.DatagramPacket;

public class DatagramPacket_2 {
    public static void main(String[] args) {
        byte[] data = {10, 20, 30, 40, 50};
        DatagramPacket packet = new DatagramPacket(data, data.length);

        byte[] receivedData = packet.getData();
        System.out.println("Received data:");
        for(byte b : receivedData) {
            System.out.print(b + " ");
        }
    }
}
