import java.net.DatagramPacket;
import java.net.InetAddress;

public class DatagramPacket_2 {
    public static void main(String[] args) throws Exception {
        InetAddress address = InetAddress.getByName("localhost");
        byte[] sendData = "Hello, World!".getBytes();
        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, address, 8080);

        // Assuming that we have a DatagramSocket named socket
        // socket.send(sendPacket);

        byte[] receiveData = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

        // Assuming that we have a DatagramSocket named socket
        // socket.receive(receivePacket);

        String message = new String(receivePacket.getData(), 0, receivePacket.getLength());
        System.out.println("Received message: " + message);
    }
}
