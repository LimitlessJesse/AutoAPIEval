import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.Cipher;

public class CipherOutputStream_2 {
    public static void main(String[] args) {
        byte[] input = "Hello, World!".getBytes();
        
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            // Initialize the Cipher with ENCRYPT_MODE or DECRYPT_MODE and the key
            CipherOutputStream cos = new CipherOutputStream(System.out, cipher);
            cos.write(input, 0, input.length);
            cos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
