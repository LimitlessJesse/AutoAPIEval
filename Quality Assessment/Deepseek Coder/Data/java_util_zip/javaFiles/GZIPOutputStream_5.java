import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class GZIPOutputStream_5 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("file.gz");
            GZIPOutputStream gzipOS = new GZIPOutputStream(fos);
            // Write data to gzipOS
            //...
            gzipOS.finish(); // Finish the compression and write the trailer
            gzipOS.close(); // Close the stream
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
