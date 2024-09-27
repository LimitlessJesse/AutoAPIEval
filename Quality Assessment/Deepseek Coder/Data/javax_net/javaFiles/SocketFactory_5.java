import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

public class SocketFactory_5 {
    public static void main(String[] args) {
        try {
            // Get the default SocketFactory
            SocketFactory socketFactory = SSLSocketFactory.getDefault();

            // Specify the host and port
            String host = "www.example.com";
            int port = 443;

            // Specify the local address and port
            InetAddress localAddr = InetAddress.getByName("localhost");
            int localPort = 1234;

            // Create a new socket
            Socket socket = socketFactory.createSocket(host, port, localAddr, localPort);

            // Print the socket details
            System.out.println("Socket created: " + socket);

        } catch (UnknownHostException e) {
            System.out.println("Unknown host: " + e.getMessage());
        } catch (SocketException e) {
            System.out.println("Socket error: " + e.getMessage());
        }
    }
}
