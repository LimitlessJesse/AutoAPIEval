import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.AlgorithmParameterSpec;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.KeyFactory;
import java.security.spec.KeySpec;

public class ECPrivateKeySpec_2 {
    public static void main(String[] args) throws Exception {
        // Generate a key pair
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("EC");
        ECGenParameterSpec ecGenParameterSpec = new ECGenParameterSpec("secp256k1");
        keyGen.initialize(ecGenParameterSpec, new SecureRandom());
        KeyPair keyPair = keyGen.generateKeyPair();

        // Get the private key
        ECPrivateKey privateKey = (ECPrivateKey) keyPair.getPrivate();

        // Get the private key specification
        ECPrivateKeySpec privateKeySpec = new ECPrivateKeySpec(privateKey.getS(), privateKey.getParams().getCurve());

        // Get the parameters from the private key specification
        ECParameterSpec params = privateKeySpec.getParams();

        System.out.println("Curve name: " + params.getCurve().getCurveName());
        System.out.println("Field size: " + params.getCurve().getFieldSize());
        System.out.println("Cofactor: " + params.getCurve().getCofactor());
        System.out.println("Order: " + params.getOrder());
        System.out.println("Generator: " + params.getGenerator());
    }
}
