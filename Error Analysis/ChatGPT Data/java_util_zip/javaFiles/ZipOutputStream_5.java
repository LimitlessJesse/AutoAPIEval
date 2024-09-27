import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStream_5 {
    public static void main(String[] args) {
        try (ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream("example.zip"))) {
            ZipEntry entry = new ZipEntry("example.txt");
            zipOut.putNextEntry(entry);
            zipOut.write("Hello, World!".getBytes());
            zipOut.closeEntry();
            
            zipOut.finish(); // Finishes writing the contents of the ZIP output stream without closing it
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
