import javax.crypto.Cipher;
import java.security.Key;

public class Cipher_1 {
    public static void main(String[] args) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            Key key = // initialize your key here
            cipher.init(Cipher.ENCRYPT_MODE, key);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
