import javax.net.ssl.SSLContext;
import java.util.Arrays;

public class SSLContext_1 {
    public static void main(String[] args) {
        try {
            SSLContext sslContext = SSLContext.getInstance("TLS");
            System.out.println("SSLContext instance created: " + sslContext);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
