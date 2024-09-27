import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.CheckedInputStream;

public class CheckedInputStream_3 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("example.zip");
            CheckedInputStream cis = new CheckedInputStream(fis);
            
            long bytesSkipped = cis.skip(10);
            System.out.println("Bytes skipped: " + bytesSkipped);
            
            cis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
