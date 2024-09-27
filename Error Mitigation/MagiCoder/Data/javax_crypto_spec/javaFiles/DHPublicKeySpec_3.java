import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.spec.DSAPublicKeySpec;
import java.security.spec.DHPublicKeySpec;

public class DHPublicKeySpec_3 {
    public static void main(String[] args) throws Exception {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("DH");
        keyPairGenerator.initialize(1024);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();

        DHPublicKeySpec dhPublicKeySpec = keyPair.getPublic().getFormat().equals("DH")
               ? new DHPublicKeySpec(keyPair.getPublic().getParams().getP(), keyPair.getPublic().getParams().getG())
                : null;

        BigInteger p = dhPublicKeySpec.getP();
        System.out.println("The prime modulus p is: " + p);
    }
}
