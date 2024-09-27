import java.net.Socket;
import java.net.SocketException;

public class Socket_24 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("www.google.com", 80);
            boolean keepAlive = socket.getKeepAlive();
            System.out.println("SO_KEEPALIVE is " + (keepAlive? "enabled" : "disabled"));
            socket.close();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
