import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStream_1 {
    public static void main(String[] args) {
        String fileName = "example.zip";
        try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(fileName))) {
            ZipEntry ze = new ZipEntry("test.txt");
            zos.putNextEntry(ze);
            zos.write("Hello, World!".getBytes());
            zos.closeEntry();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
