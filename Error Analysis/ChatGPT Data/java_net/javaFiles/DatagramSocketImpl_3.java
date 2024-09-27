import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class DatagramSocketImpl_3 {
    public static void send(DatagramPacket packet) {
        try {
            DatagramSocket socket = new DatagramSocket();
            socket.send(packet);
            socket.close();
        } catch (SocketException e) {
            System.out.println("SocketException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("127.0.0.1");
            int port = 12345;
            String message = "Hello, DatagramSocketImpl!";

            byte[] data = message.getBytes();
            DatagramPacket packet = new DatagramPacket(data, data.length, address, port);

            send(packet);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
