import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class GZIPOutputStream_3 {
    public static void main(String[] args) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            GZIPOutputStream gzipOutput = new GZIPOutputStream(baos);
            byte[] data = "Hello, World!".getBytes();
            int offset = 0;
            int length = data.length;
            
            gzipOutput.write(data, offset, length);
            gzipOutput.finish();
            gzipOutput.close();
            
            byte[] compressedData = baos.toByteArray();
            System.out.println("Compressed data length: " + compressedData.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
