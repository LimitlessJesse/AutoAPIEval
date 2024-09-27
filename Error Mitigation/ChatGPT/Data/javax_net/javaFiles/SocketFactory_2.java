import javax.net.SocketFactory;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketFactory_2 {
    public static void main(String[] args) {
        SocketFactory socketFactory = SocketFactory.getDefault();
        try {
            Socket socket = socketFactory.createSocket("example.com", 80);
            System.out.println("Socket created and connected to example.com on port 80");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
