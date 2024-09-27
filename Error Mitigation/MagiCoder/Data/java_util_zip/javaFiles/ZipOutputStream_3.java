import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStream_3 {
    public static void main(String[] args) {
        try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream("test.zip"))) {
            ZipEntry ze = new ZipEntry("test.txt");
            zos.putNextEntry(ze);
            // write something to the entry
            zos.write("Hello, World!".getBytes());
            // close the current entry
            zos.closeEntry();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
