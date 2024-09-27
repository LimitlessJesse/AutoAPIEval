import java.io.IOException;
import java.util.zip.GZIPInputStream;

public class GZIPInputStream_2 {
    public static void main(String[] args) {
        try {
            GZIPInputStream gzipInputStream = new GZIPInputStream(System.in);
            // Perform operations with the GZIPInputStream

            // Closing the input stream
            gzipInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
