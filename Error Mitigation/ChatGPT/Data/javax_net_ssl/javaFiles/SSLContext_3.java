import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

public class SSLContext_3 {
    public static void main(String[] args) {
        try {
            SSLContext sslContext = SSLContext.getInstance("TLS");
            SSLSocketFactory socketFactory = sslContext.getSocketFactory();
            System.out.println("SocketFactory object: " + socketFactory);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
