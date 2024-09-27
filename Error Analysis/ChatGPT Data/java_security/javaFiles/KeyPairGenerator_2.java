import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class KeyPairGenerator_2 {
    public static void main(String[] args) {
        initializeKeyPairGenerator(2048);
    }

    public static void initializeKeyPairGenerator(int keysize) {
        try {
            KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
            keyGen.initialize(keysize);
            System.out.println("KeyPairGenerator initialized with keysize: " + keysize);
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Algorithm not found: " + e.getMessage());
        }
    }
}
