import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;

public class SSLParameters_2 {
    public static void main(String[] args) {
        try {
            SSLSocketFactory factory = (SSLSocketFactory) SSLSocketFactory.getDefault();
            SSLSocket socket = (SSLSocket) factory.createSocket("www.example.com", 443);
            SSLParameters params = new SSLParameters();
            String[] cipherSuites = params.getCipherSuites();

            for (String cipherSuite : cipherSuites) {
                System.out.println(cipherSuite);
            }

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
