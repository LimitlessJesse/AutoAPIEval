import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.net.InetSocketAddress;

public class SSLSocket_31 {
    public static void main(String[] args) {
        try {
            SSLSocketFactory factory = (SSLSocketFactory) SSLSocketFactory.getDefault();
            SSLSocket socket = (SSLSocket) factory.createSocket("www.example.com", 443);
            socket.connect(new InetSocketAddress("www.example.com", 443));

            SSLParameters sslParameters = socket.getSSLParameters();
            System.out.println(sslParameters);

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
