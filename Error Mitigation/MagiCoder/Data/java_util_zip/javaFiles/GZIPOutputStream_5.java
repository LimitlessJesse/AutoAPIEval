import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class GZIPOutputStream_5 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("output.gz");
             GZIPOutputStream gzipOS = new GZIPOutputStream(fos)) {
            // Write some data to the GZIPOutputStream
            gzipOS.write("Hello, World!".getBytes());

            // Finish writing to the GZIPOutputStream
            gzipOS.finish();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
