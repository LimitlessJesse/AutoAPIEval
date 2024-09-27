import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipInputStream_3 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("example.zip");
            ZipInputStream zis = new ZipInputStream(fis);
            ZipEntry entry = zis.getNextEntry();
            
            byte[] buffer = new byte[1024];
            int len;
            while ((len = zis.read(buffer, 0, buffer.length)) != -1) {
                // Process the data read from the ZIP entry
            }
            
            zis.closeEntry();
            zis.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
