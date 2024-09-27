import javax.crypto.CipherInputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.NoSuchPaddingException;
import java.security.spec.InvalidParameterSpecException;

public class CipherInputStream_4 {
    public static void main(String[] args) {
        try {
            // Initialize the input stream
            InputStream inputStream = new FileInputStream("path_to_your_file");

            // Initialize the cipher
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            IvParameterSpec iv = new IvParameterSpec("AAAAAAAAAAAAAAAA".getBytes());
            cipher.init(Cipher.DECRYPT_MODE, key, iv);

            // Initialize the cipher input stream
            CipherInputStream cipherInputStream = new CipherInputStream(inputStream, cipher);

            // Read from the cipher input stream
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = cipherInputStream.read(buffer))!= -1) {
                // Process the bytes
            }

            // Close the cipher input stream
            cipherInputStream.close();

        } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | InvalidParameterSpecException | InvalidAlgorithmParameterException | FileNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
}
