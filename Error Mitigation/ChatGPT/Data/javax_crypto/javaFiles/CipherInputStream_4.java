import javax.crypto.CipherInputStream;
import java.io.IOException;

public class CipherInputStream_4 {
    public static void main(String[] args) {
        try {
            CipherInputStream cipherInputStream = new CipherInputStream(System.in, null);
            long bytesSkipped = cipherInputStream.skip(5);
            System.out.println("Bytes skipped: " + bytesSkipped);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
