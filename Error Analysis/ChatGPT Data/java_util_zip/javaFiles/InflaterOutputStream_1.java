import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.InflaterOutputStream;

public class InflaterOutputStream_1 {
    public static void main(String[] args) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InflaterOutputStream inflaterOutputStream = new InflaterOutputStream(byteArrayOutputStream);
            
            byte[] data = {97, 98, 99, 100, 101}; // Sample byte array
            
            // Writing data to InflaterOutputStream
            inflaterOutputStream.write(data, 0, data.length);
            inflaterOutputStream.close(); // Closing stream
            
            byte[] decompressedData = byteArrayOutputStream.toByteArray();
            System.out.println("Decompressed data: " + new String(decompressedData));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
