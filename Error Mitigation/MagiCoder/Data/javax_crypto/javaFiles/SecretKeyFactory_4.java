import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class SecretKeyFactory_4 {
    public static void main(String[] args) {
        try {
            SecretKeyFactory factory = SecretKeyFactory.getInstance("AES");
            SecretKey key = new SecretKeySpec("1234567890123456".getBytes(), "AES");
            SecretKey translatedKey = factory.translateKey(key);
            System.out.println(translatedKey);
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            e.printStackTrace();
        }
    }
}
