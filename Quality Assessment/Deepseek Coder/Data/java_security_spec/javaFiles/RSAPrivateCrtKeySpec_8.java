import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.RSAPrivateCrtKeySpec;

public class RSAPrivateCrtKeySpec_8 {
    public static void main(String[] args) throws Exception {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(1024, new SecureRandom());
        KeyPair keyPair = keyPairGenerator.generateKeyPair();

        RSAPrivateCrtKeySpec privateKeySpec = keyPair.getPrivate().getSpec(RSAPrivateCrtKeySpec.class);
        BigInteger crtCoefficient = privateKeySpec.getCrtCoefficient();

        System.out.println("CRT Coefficient: " + crtCoefficient);
    }
}
