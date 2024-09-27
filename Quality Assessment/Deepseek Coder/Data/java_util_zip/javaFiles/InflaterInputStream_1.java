import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.InflaterInputStream;
import java.util.zip.Inflater;

public class InflaterInputStream_1 {
    public static void main(String[] args) {
        byte[] compressedData = { /* your compressed data here */ };
        byte[] decompressedData = decompress(compressedData);
        System.out.println(new String(decompressedData));
    }

    private static byte[] decompress(byte[] compressedData) {
        try (InflaterInputStream in = new InflaterInputStream(new ByteArrayInputStream(compressedData))) {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len;
            while ((len = in.read(buffer))!= -1) {
                out.write(buffer, 0, len);
            }
            return out.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException("Failed to decompress data", e);
        }
    }
}
