import java.security.KeyPairGenerator;
import java.security.Provider;

public class KeyPairGenerator_4 {
    public static void main(String[] args) {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            Provider provider = keyPairGenerator.getProvider();
            System.out.println("Provider: " + provider.getName());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
