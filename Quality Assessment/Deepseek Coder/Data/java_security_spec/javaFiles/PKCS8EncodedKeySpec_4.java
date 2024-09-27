import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;

public class PKCS8EncodedKeySpec_4 {
    public static void main(String[] args) {
        try {
            // Assuming you have a private key in PEM format
            String privateKeyPEM = "-----BEGIN PRIVATE KEY-----\n" +
                    "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCzH3..." +
                    "...\n" +
                    "-----END PRIVATE KEY-----";

            // Remove the PEM header and footer
            privateKeyPEM = privateKeyPEM.replace("-----BEGIN PRIVATE KEY-----", "")
                   .replace("-----END PRIVATE KEY-----", "")
                   .replaceAll("\\s", "");

            // Decode the Base64-encoded private key
            byte[] encodedPrivateKey = Base64.getDecoder().decode(privateKeyPEM);

            // Create a PKCS8EncodedKeySpec from the decoded private key
            PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(encodedPrivateKey);

            // Get the KeyFactory for generating private keys
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");

            // Generate the private key
            PrivateKey privateKey = keyFactory.generatePrivate(keySpec);

            // Get the encoded form of the private key
            byte[] encodedKey = privateKey.getEncoded();

            // Print the encoded form of the private key
            System.out.println(Base64.getEncoder().encodeToString(encodedKey));

        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            e.printStackTrace();
        }
    }
}
