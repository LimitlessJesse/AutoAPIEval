import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.io.IOException;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

public class SocketFactory_3 {
    public static void main(String[] args) {
        try {
            SocketFactory factory = SSLSocketFactory.getDefault();
            InetAddress host = InetAddress.getByName("www.google.com");
            int port = 443;
            Socket socket = factory.createSocket(host, port);
            System.out.println("Socket created successfully");
            socket.close();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
