import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

public class KeyFactory_2 {
    public static void main(String[] args) {
        try {
            KeyFactory keyFactory = KeyFactory.getInstance("RSA", "SunRsaSign");
            System.out.println(keyFactory);
        } catch (NoSuchAlgorithmException | NoSuchProviderException e) {
            e.printStackTrace();
        }
    }
}
