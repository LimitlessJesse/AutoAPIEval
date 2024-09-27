import javax.net.SocketFactory;
import java.net.InetAddress;
import java.net.Socket;
import java.io.IOException;
import java.net.UnknownHostException;

public class SocketFactory_4 {
    public static void main(String[] args) {
        SocketFactory socketFactory = SocketFactory.getDefault();
        try {
            Socket socket = socketFactory.createSocket("example.com", 80, InetAddress.getLocalHost(), 8080);
            System.out.println("Socket created: " + socket);
        } catch (IOException | UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
