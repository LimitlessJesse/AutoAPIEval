import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStream_1 {
    public static void main(String[] args) {
        try {
            ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream("example.zip"));
            ZipEntry entry = new ZipEntry("example.txt");
            zipOut.putNextEntry(entry);
            zipOut.closeEntry();
            zipOut.close();
            System.out.println("ZIP file created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
