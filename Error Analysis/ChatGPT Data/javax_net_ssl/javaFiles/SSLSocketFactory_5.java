import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.net.Socket;

public class SSLSocketFactory_5 {
    public static void main(String[] args) {
        try {
            SSLSocketFactory sslSocketFactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
            Socket socket = new Socket();
            String host = "example.com";
            int port = 443;
            boolean autoClose = true;

            Socket sslSocket = sslSocketFactory.createSocket(socket, host, port, autoClose);

            System.out.println("SSL Socket created successfully");
        } catch (IOException e) {
            System.out.println("Error creating SSL Socket: " + e.getMessage());
        }
    }
}
