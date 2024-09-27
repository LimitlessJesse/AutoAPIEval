import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class GZIPOutputStream_4 {
    public static void main(String[] args) {
        try (GZIPOutputStream gzipOS = new GZIPOutputStream(new FileOutputStream("output.gz"))) {
            String s = "Hello, World!";
            byte[] data = s.getBytes();
            gzipOS.write(data, 0, data.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
