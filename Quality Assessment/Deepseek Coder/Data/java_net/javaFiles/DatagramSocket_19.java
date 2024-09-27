import java.net.DatagramSocket;
import java.net.SocketException;

public class DatagramSocket_19 {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(4445);
            socket.setReceiveBufferSize(1024);
            System.out.println("Receive Buffer Size: " + socket.getReceiveBufferSize());
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
