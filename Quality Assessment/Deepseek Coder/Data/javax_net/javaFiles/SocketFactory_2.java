import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

public class SocketFactory_2 {
    public static void main(String[] args) {
        try {
            // Get the SocketFactory instance
            SocketFactory socketFactory = SSLSocketFactory.getDefault();

            // Get the InetAddress instance
            InetAddress host = InetAddress.getByName("www.example.com");

            // Define the port
            int port = 443;

            // Create a socket
            Socket socket = socketFactory.createSocket(host, port);

            // Print the socket details
            System.out.println("Socket class: " + socket.getClass().getName());
            System.out.println("Remote address: " + socket.getInetAddress().getHostAddress());
            System.out.println("Port: " + socket.getPort());
            System.out.println("Local socket address: " + socket.getLocalSocketAddress().toString());
            System.out.println("Local address: " + socket.getLocalAddress().getHostAddress());
            System.out.println("Local port: " + socket.getLocalPort());

            // Close the socket
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
