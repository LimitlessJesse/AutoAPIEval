import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class SecretKeyFactory_1 {
    public static void main(String[] args) throws Exception {
        char[] password = "password".toCharArray();
        byte[] salt = new byte[] {1, 2, 3, 4, 5, 6, 7, 8};
        int iterations = 10000;
        int keyLength = 256;

        PBEKeySpec keySpec = new PBEKeySpec(password, salt, iterations, keyLength);
        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
        SecretKey secretKey = factory.generateSecret(keySpec);

        System.out.println("Generated secret key: " + secretKey);
    }
}
