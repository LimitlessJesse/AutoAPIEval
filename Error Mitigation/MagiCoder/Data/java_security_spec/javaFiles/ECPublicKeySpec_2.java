import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;

public class ECPublicKeySpec_2 {
    public static void main(String[] args) throws Exception {
        // Generate a key pair
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("EC");
        ECGenParameterSpec ecsp = new ECGenParameterSpec("secp256k1");
        kpg.initialize(ecsp);
        KeyPair kp = kpg.generateKeyPair();

        // Get the public key
        java.security.PublicKey publicKey = kp.getPublic();

        // Get the parameters of the public key
        ECParameterSpec params = publicKey.getParams();

        // Get the public point W
        ECPoint w = ((ECPublicKeySpec) publicKey.getSpec()).getW();

        // Print the public point W
        System.out.println("Public point W: " + w);
    }
}
