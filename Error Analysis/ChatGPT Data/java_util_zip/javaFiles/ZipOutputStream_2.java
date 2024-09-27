import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStream_2 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("example.zip");
             ZipOutputStream zos = new ZipOutputStream(fos)) {

            ZipEntry entry = new ZipEntry("example.txt");
            zos.putNextEntry(entry);
            zos.closeEntry();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
