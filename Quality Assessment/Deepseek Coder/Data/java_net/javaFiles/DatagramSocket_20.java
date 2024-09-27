import java.net.DatagramSocket;
import java.net.SocketException;

public class DatagramSocket_20 {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(4445);
            int bufferSize = socket.getReceiveBufferSize();
            System.out.println("Receive Buffer Size: " + bufferSize);
            socket.close();
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
