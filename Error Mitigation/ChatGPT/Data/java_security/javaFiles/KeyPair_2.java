import java.security.KeyPair;
import java.security.PrivateKey;

public class KeyPair_2 {
    public static void main(String[] args) {
        KeyPair keyPair = // initialize KeyPair object
        PrivateKey privateKey = keyPair.getPrivate();
        System.out.println("Private Key: " + privateKey);
    }
}
