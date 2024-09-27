import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

public class SocketFactory_4 {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.google.com");
            int port = 443;
            InetAddress localAddr = InetAddress.getByName("localhost");
            int localPort = 1234;

            SocketFactory socketFactory = SSLSocketFactory.getDefault();
            Socket socket = socketFactory.createSocket(address, port, localAddr, localPort);

            System.out.println("Socket created: " + socket);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
