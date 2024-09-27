import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;

public class SSLSocket_9 {
    public static void main(String[] args) {
        try {
            SSLSocketFactory factory = (SSLSocketFactory) SSLSocketFactory.getDefault();
            SSLSocket socket = (SSLSocket) factory.createSocket("www.example.com", 443);
            String[] cipherSuites = socket.getEnabledCipherSuites();
            for (String cipherSuite : cipherSuites) {
                System.out.println(cipherSuite);
            }
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
