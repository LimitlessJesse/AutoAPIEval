import java.net.Socket;
import java.net.SocketAddress;
import java.net.InetSocketAddress;
import java.io.IOException;

public class Socket_8 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket();
            SocketAddress address = new InetSocketAddress("localhost", 8080);
            socket.bind(address);
            System.out.println("Socket is bound to address: " + address);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
