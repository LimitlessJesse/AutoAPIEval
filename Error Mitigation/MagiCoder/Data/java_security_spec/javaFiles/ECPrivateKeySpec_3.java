import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

public class ECPrivateKeySpec_3 {
    public static void main(String[] args) throws Exception {
        // Create a KeyPairGenerator object
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("EC");

        // Create a SecureRandom object
        SecureRandom secRandom = new SecureRandom();

        // Create an ECGenParameterSpec object
        ECGenParameterSpec ecSpec = new ECGenParameterSpec("secp256r1");

        // Initialize the KeyPairGenerator object
        kpg.initialize(ecSpec, secRandom);

        // Generate the KeyPair
        KeyPair kp = kpg.generateKeyPair();

        // Get the private key
        ECPrivateKeySpec privKeySpec = kp.getPrivate().getECPrivateKey();

        // Get the associated elliptic curve domain parameters
        ECParameterSpec params = privKeySpec.getParams();

        // Print the parameters
        System.out.println("Curve: " + params.getCurve());
        System.out.println("G: " + params.getG());
        System.out.println("N: " + params.getN());
        System.out.println("H: " + params.getH());
        System.out.println("Seed: " + params.getSeed());
    }
}
