import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;

public class KeyFactory_1 {
    public static void main(String[] args) {
        try {
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            System.out.println(keyFactory);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
