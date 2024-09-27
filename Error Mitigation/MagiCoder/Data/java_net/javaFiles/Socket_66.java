import java.net.Socket;
import java.net.SocketException;

public class Socket_66 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket();
            int trafficClass = socket.getTrafficClass();
            System.out.println("Traffic class: " + trafficClass);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
