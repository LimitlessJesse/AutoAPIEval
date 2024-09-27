import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import java.io.IOException;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.Key;

public class CipherOutputStream_2 {
    public static void main(String[] args) {
        try {
            Key key =...; // your key
            IvParameterSpec iv =...; // your initialization vector
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, key, iv);
            OutputStream out = new CipherOutputStream(System.out, cipher);
            out.write("Hello, World!".getBytes());
        } catch (GeneralSecurityException | IOException e) {
            e.printStackTrace();
        }
    }
}
