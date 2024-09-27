import javax.crypto.SecretKeyFactory;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;

public class SecretKeyFactory_3 {
    public static void main(String[] args) {
        try {
            SecretKeyFactory factory = SecretKeyFactory.getInstance("AES");
            SecretKey originalKey = new SecretKeySpec("mySecretKey".getBytes(), "AES");
            
            SecretKey translatedKey = factory.translateKey(originalKey);
            
            System.out.println("Original Key: " + originalKey);
            System.out.println("Translated Key: " + translatedKey);
        } catch (InvalidKeyException e) {
            System.out.println("Invalid Key Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
