import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.ECPoint;

public class ECPrivateKeySpec_2 {
    public static void main(String[] args) throws Exception {
        // Generate a key pair
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("EC");
        ECGenParameterSpec ecsp = new ECGenParameterSpec("secp256r1");
        kpg.initialize(ecsp, new SecureRandom());
        KeyPair kp = kpg.generateKeyPair();

        // Get the private key
        ECPrivateKeySpec privSpec = kp.getPrivate().getPrivateKey().getPrivateKey();

        // Get the private value S
        BigInteger s = privSpec.getS();

        System.out.println("Private value S: " + s);
    }
}
