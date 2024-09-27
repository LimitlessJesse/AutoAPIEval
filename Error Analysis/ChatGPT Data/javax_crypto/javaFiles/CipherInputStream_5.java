import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;

public class CipherInputStream_5 {
    public static void main(String[] args) {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        CipherInputStream cipherInputStream = new CipherInputStream(System.in, cipher);
        
        int bytesRead = 0;
        while (cipherInputStream.available() > 0) {
            int data = cipherInputStream.read();
            // Process the data read from CipherInputStream
            bytesRead++;
        }
        
        System.out.println("Total bytes read: " + bytesRead);
        
        cipherInputStream.close();
    }
}
