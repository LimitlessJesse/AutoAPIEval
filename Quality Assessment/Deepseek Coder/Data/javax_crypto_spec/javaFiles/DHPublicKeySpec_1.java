import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.spec.DHPublicKeySpec;
import java.security.spec.RSAPublicKeySpec;

import javax.crypto.KeyGenerator;
import javax.crypto.spec.DHParameterSpec;

public class DHPublicKeySpec_1 {
    public static void main(String[] args) throws Exception {
        // Generate a DH key pair
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("DH");
        kpg.initialize(2048);
        KeyPair kp = kpg.generateKeyPair();

        // Get the DH public key
        DHPublicKeySpec dhPublicKeySpec = kp.getPublic();

        // Get the g value from the DH public key
        BigInteger g = dhPublicKeySpec.getG();

        System.out.println("g value: " + g);
    }
}
