import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocketFactory;

public class SSLContext_4 {
    public static void main(String[] args) {
        try {
            SSLContext sslContext = SSLContext.getInstance("TLS");
            SSLServerSocketFactory serverSocketFactory = sslContext.getServerSocketFactory();
            System.out.println("ServerSocketFactory object: " + serverSocketFactory);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
