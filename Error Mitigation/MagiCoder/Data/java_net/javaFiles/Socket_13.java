import java.net.Socket;
import java.net.SocketAddress;
import java.io.IOException;

public class Socket_13 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("www.google.com", 80);
            SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
            System.out.println("Remote Socket Address: " + remoteSocketAddress);
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
