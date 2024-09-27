import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

public class KeyFactory_4 {
    public static void main(String[] args) {
        try {
            String algorithm = "RSA";
            String publicKeyString = "MIIBCgKCAQEA3x8UZ9PZ/PkD4St11NQ7I6Hd+ZzG3Rr1q01sZhJx3tkK9X5I/qaot9P" +
                    "5zfJgkr1P6IeMm9h4dJZ0NQrUm9zPZoYIn4QZo+vVzJuT6JQnIQIDAQAB";
            byte[] publicKeyBytes = Base64.getDecoder().decode(publicKeyString);
            KeyFactory keyFactory = KeyFactory.getInstance(algorithm);
            X509EncodedKeySpec keySpec = new X509EncodedKeySpec(publicKeyBytes);
            keyFactory.generatePublic(keySpec);
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            e.printStackTrace();
        }
    }
}
