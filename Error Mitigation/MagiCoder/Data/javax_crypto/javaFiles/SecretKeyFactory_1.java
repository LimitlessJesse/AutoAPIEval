import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.Base64;

public class SecretKeyFactory_1 {
    public static void main(String[] args) {
        try {
            SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            KeySpec spec = new PBEKeySpec("password".toCharArray(), "salt".getBytes(), 65536, 256);
            SecretKey tmp = factory.generateSecret(spec);
            byte[] encoded = Base64.getEncoder().encode(tmp.getEncoded());
            System.out.println(new String(encoded));
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            e.printStackTrace();
        }
    }
}
