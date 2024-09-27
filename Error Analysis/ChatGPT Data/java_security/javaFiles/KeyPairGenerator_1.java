import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class KeyPairGenerator_1 {
    public static void main(String[] args) {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048); // Key size
            KeyPair keyPair = keyPairGenerator.generateKeyPair();
            
            System.out.println("Public Key: " + keyPair.getPublic());
            System.out.println("Private Key: " + keyPair.getPrivate());
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
