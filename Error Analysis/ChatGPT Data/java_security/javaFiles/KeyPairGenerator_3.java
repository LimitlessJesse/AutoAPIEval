import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class KeyPairGenerator_3 {
    public static void main(String[] args) {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            String algorithm = keyPairGenerator.getAlgorithm();
            System.out.println("Key pair algorithm: " + algorithm);
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Algorithm not found: " + e.getMessage());
        }
    }
}
