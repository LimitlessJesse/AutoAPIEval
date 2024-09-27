import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipInputStream_5 {
    public static void main(String[] args) {
        try (ZipInputStream zis = new ZipInputStream(new FileInputStream("test.zip"))) {
            ZipEntry entry;
            while ((entry = zis.getNextEntry())!= null) {
                System.out.println("Extracting: " + entry.getName());
                // Here you can add your code to process the entry
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
