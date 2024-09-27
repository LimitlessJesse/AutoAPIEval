import javax.net.SocketFactory;
import java.net.Socket;
import java.io.IOException;

public class SocketFactory_2 {
    public static void main(String[] args) {
        try {
            SocketFactory socketFactory = SocketFactory.getDefault();
            Socket socket = socketFactory.createSocket("localhost", 8080);
            System.out.println("Socket created: " + socket);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
