import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStream_4 {
    public static void main(String[] args) {
        try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream("example.zip"))) {
            zos.setMethod(ZipOutputStream.STORED); // Set compression method to STORED
            ZipEntry entry = new ZipEntry("example.txt");
            zos.putNextEntry(entry);
            zos.write("This is an example file".getBytes());
            zos.closeEntry();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
