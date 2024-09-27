import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;

public class KeyFactory_2 {
    public static void main(String[] args) throws Exception {
        // Suppose we have a base64 encoded private key
        String privateKeyBase64 = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQC4n...";

        // Decode the base64 encoded private key
        byte[] privateKeyBytes = Base64.getDecoder().decode(privateKeyBase64);

        // Create a PKCS8EncodedKeySpec from the decoded private key bytes
        PKCS8EncodedKeySpec privateKeySpec = new PKCS8EncodedKeySpec(privateKeyBytes);

        // Create a KeyFactory instance for generating private keys
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");

        // Generate the private key
        PrivateKey privateKey = keyFactory.generatePrivate(privateKeySpec);

        // Now you can use the private key for encryption or decryption
    }
}
