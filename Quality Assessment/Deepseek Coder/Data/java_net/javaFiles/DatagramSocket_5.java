import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.io.IOException;

public class DatagramSocket_5 {
    public static void main(String[] args) {
        try {
            // Create a datagram socket
            DatagramSocket socket = new DatagramSocket(8080);

            // Create a buffer to store incoming data
            byte[] buffer = new byte[1024];

            // Create a datagram packet to receive data
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

            // Receive data from the socket
            socket.receive(packet);

            // Print the received data
            String message = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Received message: " + message);

            // Close the socket
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
