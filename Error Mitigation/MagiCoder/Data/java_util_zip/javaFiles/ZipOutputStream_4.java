import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStream_4 {
    public static void main(String[] args) {
        try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream("test.zip"))) {
            ZipEntry entry = new ZipEntry("test.txt");
            zos.putNextEntry(entry);
            String data = "Hello, World!";
            zos.write(data.getBytes(), 0, data.length());
            zos.closeEntry();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
