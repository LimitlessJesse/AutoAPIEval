import javax.crypto.CipherInputStream;
import java.io.IOException;

public class CipherInputStream_1 {
    public static void main(String[] args) {
        try {
            CipherInputStream cipherInputStream = new CipherInputStream(System.in, null);
            int data = cipherInputStream.read();
            System.out.println("Read data: " + data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
