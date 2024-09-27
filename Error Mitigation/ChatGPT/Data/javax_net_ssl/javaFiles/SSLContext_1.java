import javax.net.ssl.SSLContext;
import java.security.NoSuchAlgorithmException;

public class SSLContext_1 {
    public static void main(String[] args) {
        try {
            SSLContext sslContext = SSLContext.getInstance("TLS");
            System.out.println("SSLContext object created: " + sslContext);
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Error creating SSLContext object: " + e.getMessage());
        }
    }
}
