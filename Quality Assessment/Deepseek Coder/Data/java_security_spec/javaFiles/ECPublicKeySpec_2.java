import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.AlgorithmParameterSpec;
import java.security.interfaces.ECPublicKey;
import java.security.KeyFactory;

public class ECPublicKeySpec_2 {
    public static void main(String[] args) throws Exception {
        // Generate a key pair
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("EC");
        ECGenParameterSpec ecGenParameterSpec = new ECGenParameterSpec("secp256k1");
        kpg.initialize(ecGenParameterSpec, new SecureRandom());
        KeyPair keyPair = kpg.generateKeyPair();

        // Get the public key
        ECPublicKey publicKey = (ECPublicKey) keyPair.getPublic();

        // Get the public key specification
        ECPublicKeySpec publicKeySpec = publicKey.getSpec();

        // Get the parameters of the public key
        ECParameterSpec params = publicKeySpec.getParams();

        // Print the parameters
        System.out.println("Curve name: " + params.getCurve().getCurveName());
        System.out.println("Point count: " + params.getPointCount());
        System.out.println("Order: " + params.getOrder());
    }
}
