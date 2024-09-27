import java.security.KeyPair;
import java.security.PublicKey;

public class KeyPair_1 {
    public static void main(String[] args) {
        KeyPair keyPair = // initialize KeyPair object with public and private keys
        PublicKey publicKey = keyPair.getPublic();
        System.out.println("Public Key: " + publicKey);
    }
}
