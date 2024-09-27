import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

public class GZIPInputStream_4 {
    public static void main(String[] args) {
        byte[] data = { /* your compressed data here */ };
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);
        GZIPInputStream gzipInputStream = new GZIPInputStream(byteArrayInputStream);

        byte[] buffer = new byte[1024];
        int bytesRead;
        try {
            while ((bytesRead = gzipInputStream.read(buffer, 0, buffer.length))!= -1) {
                // process the data in buffer
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
