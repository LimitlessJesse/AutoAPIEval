import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

public class KeyFactory_5 {
    public static void main(String[] args) {
        try {
            String algorithm = "RSA";
            String provider = "SunRsaSign";

            KeyFactory keyFactory = KeyFactory.getInstance(algorithm, provider);

            // Assuming we have a valid public key in PEM format
            String publicKeyPEM = "-----BEGIN PUBLIC KEY-----\n" +
                    "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA38j+JHk/hmN+qRPX\n" +
                    "h3LrN+h2l3m998M3W+hD+xZi2T97b9D1L/z9U2L9jJuu1XTJJptn5gP1NtY+\n" +
                    "YT4Mm9nYtIXr/wIDAQAB\n" +
                    "-----END PUBLIC KEY-----";

            // Remove the PEM header and footer
            publicKeyPEM = publicKeyPEM.replace("-----BEGIN PUBLIC KEY-----", "")
                   .replace("-----END PUBLIC KEY-----", "")
                   .replaceAll("\\s+", "");

            // Decode the Base64 encoded public key
            byte[] publicKeyBytes = Base64.getDecoder().decode(publicKeyPEM);

            // Create a key specification for the public key
            X509EncodedKeySpec publicKeySpec = new X509EncodedKeySpec(publicKeyBytes);

            // Generate the public key
            java.security.PublicKey publicKey = keyFactory.generatePublic(publicKeySpec);

            System.out.println("Public key generated successfully: " + publicKey);

        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            e.printStackTrace();
        }
    }
}
