import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.Key;

public class CipherOutputStream_3 {
    public static void main(String[] args) {
        try {
            // Create a key
            Key key =...;

            // Create an initialization vector
            IvParameterSpec iv = new IvParameterSpec(new byte[16]);

            // Create a cipher
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, key, iv);

            // Create a CipherOutputStream
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            CipherOutputStream cos = new CipherOutputStream(baos, cipher);

            // Create some data to write
            byte[] data = "Hello, World!".getBytes();

            // Write the data
            cos.write(data);
            cos.close();

            // Print the encrypted data
            System.out.println(new String(baos.toByteArray()));
        } catch (GeneralSecurityException | IOException e) {
            e.printStackTrace();
        }
    }
}
