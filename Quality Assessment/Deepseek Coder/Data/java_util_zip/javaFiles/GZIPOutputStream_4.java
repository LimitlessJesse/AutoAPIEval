import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class GZIPOutputStream_4 {
    public static void main(String[] args) {
        String data = "Hello, World!";
        byte[] buffer = new byte[1024];
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        try (GZIPOutputStream gzipOS = new GZIPOutputStream(bos)) {
            gzipOS.write(data.getBytes());
            gzipOS.flush();

            byte[] compressedData = bos.toByteArray();
            System.out.println("Compressed data length: " + compressedData.length);

            // Now, let's decompress the data
            byte[] decompressedData = new byte[1024];
            gzipOS.write(compressedData, 0, compressedData.length, decompressedData, 0, decompressedData.length);
            System.out.println("Decompressed data: " + new String(decompressedData));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
