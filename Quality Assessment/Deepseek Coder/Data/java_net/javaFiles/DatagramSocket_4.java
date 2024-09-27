import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;

public class DatagramSocket_4 {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        String message = "Hello, Server!";
        InetAddress address = InetAddress.getByName("localhost");
        int port = 8080;
        byte[] buffer = message.getBytes();
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, port);
        socket.send(packet);
        socket.close();
    }
}
