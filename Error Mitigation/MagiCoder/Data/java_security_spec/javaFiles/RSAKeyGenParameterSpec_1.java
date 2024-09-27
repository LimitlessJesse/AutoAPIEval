import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.spec.RSAKeyGenParameterSpec;

public class RSAKeyGenParameterSpec_1 {
    public static void main(String[] args) throws Exception {
        // Create a KeyPairGenerator object
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");

        // Create a RSAKeyGenParameterSpec object
        RSAKeyGenParameterSpec spec = new RSAKeyGenParameterSpec(1024, RSAKeyGenParameterSpec.F4);

        // Initialize the KeyPairGenerator with the RSAKeyGenParameterSpec
        kpg.initialize(spec);

        // Generate the KeyPair
        KeyPair kp = kpg.generateKeyPair();

        // Get the public key
        java.security.interfaces.RSAPublicKey publicKey = (java.security.interfaces.RSAPublicKey) kp.getPublic();

        // Get the public exponent
        BigInteger publicExponent = publicKey.getPublicExponent();

        // Print the public exponent
        System.out.println("Public Exponent: " + publicExponent);
    }
}
