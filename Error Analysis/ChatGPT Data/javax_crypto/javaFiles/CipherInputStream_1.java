import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import java.io.FileInputStream;

public class CipherInputStream_1 {
    public static void main(String[] args) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            FileInputStream fis = new FileInputStream("encryptedFile.txt");
            CipherInputStream cis = new CipherInputStream(fis, cipher);
            
            int data;
            while ((data = cis.read()) != -1) {
                System.out.print((char) data);
            }
            
            cis.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
