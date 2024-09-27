import java.io.*;
import java.util.zip.GZIPOutputStream;

public class GZIPOutputStream_1 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("example.gz");
            GZIPOutputStream gzipOS = new GZIPOutputStream(fos);
            
            String data = "Hello, World!";
            byte[] bytes = data.getBytes();
            gzipOS.write(bytes);
            
            // Finish writing compressed data without closing the stream
            gzipOS.finish();
            
            gzipOS.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
