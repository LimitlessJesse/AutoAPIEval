import java.net.Socket;
import java.net.SocketException;

public class Socket_26 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);
            boolean oobInline = socket.getOOBInline();
            System.out.println("SO_OOBINLINE is enabled: " + oobInline);
            socket.close();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
