import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipInputStream_1 {
    public static void main(String[] args) {
        try (ZipInputStream zis = new ZipInputStream(new FileInputStream("example.zip"))) {
            ZipEntry entry;
            while ((entry = zis.getNextEntry()) != null) {
                System.out.println("Entry: " + entry.getName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
