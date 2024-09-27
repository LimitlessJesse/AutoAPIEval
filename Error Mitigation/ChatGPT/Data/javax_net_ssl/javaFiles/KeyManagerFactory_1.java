import javax.net.ssl.KeyManagerFactory;
import java.security.NoSuchAlgorithmException;

public class KeyManagerFactory_1 {
    public static void main(String[] args) {
        try {
            KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance("SunX509");
            System.out.println("KeyManagerFactory instance created: " + keyManagerFactory);
        } catch (NoSuchAlgorithmException e) {
            System.out.println("NoSuchAlgorithmException: " + e.getMessage());
        }
    }
}
