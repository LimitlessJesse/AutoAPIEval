import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;

public class ECPublicKeySpec_3 {
    public static void main(String[] args) throws Exception {
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("EC");
        kpg.initialize(256);
        KeyPair kp = kpg.generateKeyPair();

        ECPublicKeySpec pubKeySpec = new ECPublicKeySpec(kp.getPublic().getW(), kp.getPublic().getParams());
        ECParameterSpec ecSpec = pubKeySpec.getParams();

        System.out.println("ECParameterSpec: " + ecSpec);
    }
}
