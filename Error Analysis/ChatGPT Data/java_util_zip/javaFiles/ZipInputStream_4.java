import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipInputStream_4 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("example.zip");
            ZipInputStream zis = new ZipInputStream(fis);
            ZipEntry entry;
            while ((entry = zis.getNextEntry()) != null) {
                System.out.println(entry.getName());
            }
            zis.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
