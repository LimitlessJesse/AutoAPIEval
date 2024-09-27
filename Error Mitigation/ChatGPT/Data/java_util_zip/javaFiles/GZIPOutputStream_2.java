import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class GZIPOutputStream_2 {
    public static void main(String[] args) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            GZIPOutputStream gzip = new GZIPOutputStream(baos);
            
            byte[] data = "Hello, World!".getBytes();
            int offset = 0;
            int length = data.length;
            
            gzip.write(data, offset, length);
            gzip.finish();
            gzip.close();
            
            byte[] compressedData = baos.toByteArray();
            System.out.println("Compressed data: " + new String(compressedData));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
