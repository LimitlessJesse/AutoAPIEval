import java.net.Socket;
import java.net.SocketException;

public class Socket_22 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket();
            boolean reuseAddress = socket.getReuseAddress();
            System.out.println("SO_REUSEADDR is " + (reuseAddress? "enabled" : "disabled"));
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
