import javax.crypto.CipherInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class CipherInputStream_3 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("file.txt");
            CipherInputStream cis = new CipherInputStream(fis, cipher);

            byte[] buffer = new byte[1024];
            int bytesRead = cis.read(buffer, 0, buffer.length);

            while (bytesRead != -1) {
                // Process the read bytes here

                bytesRead = cis.read(buffer, 0, buffer.length);
            }

            cis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
