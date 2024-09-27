import javax.net.SocketFactory;
import java.io.IOException;
import java.net.Socket;

public class SocketFactory_1 {
    public static void main(String[] args) {
        SocketFactory factory = SocketFactory.getDefault();
        try {
            Socket socket = factory.createSocket("www.google.com", 80);
            System.out.println("Socket created: " + socket);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
