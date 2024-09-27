import java.net.DatagramSocket;
import java.net.SocketException;

public class DatagramSocket_17 {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            socket.setSendBufferSize(1024); // Set the send buffer size to 1024 bytes
            System.out.println("Send buffer size: " + socket.getSendBufferSize());
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
