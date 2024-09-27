import javax.crypto.CipherOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.security.Key;
import javax.crypto.Cipher;

public class CipherOutputStream_1 {
    public static void main(String[] args) {
        try {
            Key secretKey = // initialize your secret key here
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            
            OutputStream outputStream = new FileOutputStream("encrypted.txt");
            CipherOutputStream cipherOutputStream = new CipherOutputStream(outputStream, cipher);
            
            byte[] data = "Hello, World!".getBytes();
            cipherOutputStream.write(data);
            
            cipherOutputStream.close();
            outputStream.close();
            
            System.out.println("Encryption completed.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
