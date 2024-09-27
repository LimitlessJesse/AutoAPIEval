import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

public class GZIPInputStream_3 {
    public static void main(String[] args) {
        String testString = "This is a test string.";
        byte[] compressedData = compressString(testString);
        String decompressedString = decompressString(compressedData);
        System.out.println(decompressedString);
    }

    private static byte[] compressString(String str) {
        byte[] compressedData = null;
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
             GZIPInputStream gis = new GZIPInputStream(bos)) {
            byte[] data = str.getBytes();
            gis.write(data);
            gis.close();
            compressedData = bos.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return compressedData;
    }

    private static String decompressString(byte[] compressedData) {
        String decompressedString = "";
        try (GZIPInputStream gis = new GZIPInputStream(new ByteArrayInputStream(compressedData))) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            while ((bytesRead = gis.read(buffer))!= -1) {
                bos.write(buffer, 0, bytesRead);
            }
            decompressedString = new String(bos.toByteArray());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return decompressedString;
    }
}
