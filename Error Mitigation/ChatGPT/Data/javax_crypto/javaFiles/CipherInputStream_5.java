import javax.crypto.CipherInputStream;
import java.io.IOException;

public class CipherInputStream_5 {
    public static void main(String[] args) {
        try {
            CipherInputStream cipherInputStream = new CipherInputStream(null, null); // create a CipherInputStream object
            cipherInputStream.close(); // close the CipherInputStream
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
