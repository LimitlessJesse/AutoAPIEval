import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

public class GZIPInputStream_2 {
    public static void main(String[] args) throws IOException {
        byte[] compressedData = { 
            (byte) 31, (byte) 139, (byte) 8, (byte) 0, (byte) 0, (byte) 0, 
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 75, 
            (byte) 204, (byte) 204, (byte) 45, (byte) 200, (byte) 201, 
            (byte) 201, (byte) 215, (byte) 81, (byte) 40, (byte) 207, 
            (byte) 47, (byte) 202, (byte) 73, (byte) 45, (byte) 1, 
            (byte) 0, (byte) 51, (byte) 228, (byte) 122, (byte) 89, 
            (byte) 0, (byte) 0, (byte) 0 
        };
        
        GZIPInputStream gzipInputStream = new GZIPInputStream(new ByteArrayInputStream(compressedData));
        byte[] decompressedData = new byte[100];
        int bytesRead = gzipInputStream.read(decompressedData, 0, decompressedData.length);
        
        System.out.println("Decompressed data:");
        System.out.println(new String(decompressedData, 0, bytesRead));
        
        gzipInputStream.close();
    }
}
