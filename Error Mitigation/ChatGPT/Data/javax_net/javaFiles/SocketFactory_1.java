import javax.net.SocketFactory;
import java.io.IOException;
import java.net.Socket;

public class SocketFactory_1 {
    public static void main(String[] args) {
        SocketFactory socketFactory = SocketFactory.getDefault();
        try {
            Socket socket = socketFactory.createSocket();
            System.out.println("Unconnected socket created: " + socket);
        } catch (IOException e) {
            System.out.println("Error creating socket: " + e.getMessage());
        }
    }
}
