import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

public class GZIPInputStream_1 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("compressed.gz");
            GZIPInputStream gis = new GZIPInputStream(fis);
            
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = gis.read(buffer, 0, buffer.length)) != -1) {
                System.out.write(buffer, 0, bytesRead);
            }
            
            gis.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
