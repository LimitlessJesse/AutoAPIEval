import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.spec.DSAPrivateKeySpec;

public class DSAPrivateKeySpec_4 {
    public static void main(String[] args) throws Exception {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("DSA");
        keyPairGenerator.initialize(1024);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();

        DSAPrivateKeySpec dsaPrivateKeySpec = new DSAPrivateKeySpec(keyPair.getPrivate().getEncoded());
        BigInteger q = dsaPrivateKeySpec.getQ();

        System.out.println("Q: " + q);
    }
}
