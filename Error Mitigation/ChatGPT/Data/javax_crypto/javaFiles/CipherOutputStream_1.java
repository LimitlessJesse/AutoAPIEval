import javax.crypto.CipherOutputStream;
import java.io.IOException;

public class CipherOutputStream_1 {
    public static void main(String[] args) {
        try {
            CipherOutputStream cipherOutputStream = new CipherOutputStream(System.out);
            cipherOutputStream.write(65); // writing byte 'A'
            cipherOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
