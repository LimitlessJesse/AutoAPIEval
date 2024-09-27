import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.spec.DSAPrivateKeySpec;
import java.math.BigInteger;

public class DSAPrivateKeySpec_1 {
    public static void main(String[] args) throws Exception {
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("DSA");
        kpg.initialize(1024);
        KeyPair kp = kpg.generateKeyPair();
        DSAPrivateKeySpec dks = kp.getPrivate().getSpec();
        BigInteger x = dks.getX();
        System.out.println(x);
    }
}
