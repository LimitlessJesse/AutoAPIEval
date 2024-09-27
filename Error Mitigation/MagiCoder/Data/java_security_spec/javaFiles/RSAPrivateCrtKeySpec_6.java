import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.spec.RSAPrivateCrtKeySpec;

public class RSAPrivateCrtKeySpec_6 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();

        RSAPrivateCrtKeySpec privateCrtKeySpec = keyPair.getPrivate().getPrivateKey().getPrivateKey().getPrivate();
        BigInteger primeQ = privateCrtKeySpec.getPrimeQ();

        System.out.println("PrimeQ: " + primeQ);
    }
}
