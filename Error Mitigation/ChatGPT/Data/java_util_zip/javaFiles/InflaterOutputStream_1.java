import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.InflaterOutputStream;

public class InflaterOutputStream_1 {
    public static void main(String[] args) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            InflaterOutputStream inflaterOutputStream = new InflaterOutputStream(baos);
            
            byte[] compressedData = {120, -100, 75, 76, 2, 0, 0, 0, 0, 0, -1, -1};
            inflaterOutputStream.write(compressedData, 0, compressedData.length);
            
            inflaterOutputStream.close();
            
            byte[] decompressedData = baos.toByteArray();
            System.out.println("Decompressed data: " + new String(decompressedData));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
