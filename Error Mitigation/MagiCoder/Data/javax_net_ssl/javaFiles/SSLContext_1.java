import javax.net.ssl.SSLContext;
import javax.net.ssl.NoSuchAlgorithmException;

public class SSLContext_1 {
    public static void main(String[] args) {
        try {
            SSLContext sslContext = SSLContext.getInstance("TLS");
            System.out.println(sslContext);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
