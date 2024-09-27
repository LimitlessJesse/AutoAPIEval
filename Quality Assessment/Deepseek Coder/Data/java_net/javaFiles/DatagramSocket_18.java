import java.net.DatagramSocket;
import java.net.SocketException;

public class DatagramSocket_18 {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            int sendBufferSize = socket.getSendBufferSize();
            System.out.println("Send Buffer Size: " + sendBufferSize);
            socket.close();
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
