import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

public class GZIPInputStream_3 {
    public static void main(String[] args) {
        try {
            GZIPInputStream gzipInputStream = new GZIPInputStream(new FileInputStream("file.txt.gz"));
            // Perform operations using GZIPInputStream
            gzipInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
