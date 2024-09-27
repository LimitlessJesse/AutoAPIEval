import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.spec.RSAPrivateCrtKeySpec;

public class RSAPrivateCrtKeySpec_3 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();

        RSAPrivateCrtKeySpec privateCrtKeySpec = keyPair.getPrivate().getPrivateCrtKeySpec();
        BigInteger publicExponent = privateCrtKeySpec.getPublicExponent();

        System.out.println("Public Exponent: " + publicExponent);
    }
}
