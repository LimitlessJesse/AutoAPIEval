import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipInputStream_2 {
    public static void main(String[] args) {
        try (ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream("example.zip"))) {
            ZipEntry entry;
            while ((entry = zipInputStream.getNextEntry()) != null) {
                if (!entry.isDirectory()) {
                    // Process the entry

                    // Close the current entry
                    zipInputStream.closeEntry();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
