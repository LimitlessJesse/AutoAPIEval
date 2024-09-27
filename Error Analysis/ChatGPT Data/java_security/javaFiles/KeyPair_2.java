import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;

public class KeyPair_2 {
    public static void main(String[] args) throws Exception {
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(2048);
        KeyPair keyPair = keyGen.generateKeyPair();

        PrivateKey privateKey = keyPair.getPrivate();
        System.out.println("Private Key: " + privateKey);
    }
}
