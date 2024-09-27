import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.Key;

public class CipherOutputStream_4 {
    public static void main(String[] args) {
        try {
            // Create a key
            Key key = new javax.crypto.spec.SecretKeySpec(new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, "AES");

            // Create a cipher
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, key);

            // Create a byte array to write data to
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            // Create a CipherOutputStream
            CipherOutputStream cos = new CipherOutputStream(baos, cipher);

            // Create some data to write
            byte[] data = "Hello, World!".getBytes();

            // Write the data
            cos.write(data, 0, data.length);

            // Flush the CipherOutputStream
            cos.flush();

            // Print the encrypted data
            System.out.println(new String(baos.toByteArray()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
