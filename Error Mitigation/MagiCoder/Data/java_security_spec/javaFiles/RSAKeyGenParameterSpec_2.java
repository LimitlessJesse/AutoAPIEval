import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.spec.RSAKeyGenParameterSpec;

public class RSAKeyGenParameterSpec_2 {
    public static void main(String[] args) throws Exception {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        RSAKeyGenParameterSpec spec = new RSAKeyGenParameterSpec(2048, RSAKeyGenParameterSpec.F4);
        keyPairGenerator.initialize(spec);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();

        RSAKeyGenParameterSpec keySpec = (RSAKeyGenParameterSpec) keyPairGenerator.getParameters();
        int keysize = keySpec.getKeysize();

        System.out.println("Keysize: " + keysize);
    }
}
