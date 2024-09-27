import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStream_4 {
    public static void main(String[] args) {
        try {
            ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream("example.zip"));
            zipOut.setMethod(ZipOutputStream.DEFLATED);
            // Add files to the ZIP archive
            ZipEntry entry = new ZipEntry("file.txt");
            zipOut.putNextEntry(entry);
            zipOut.closeEntry();
            zipOut.close();
            System.out.println("ZIP file created successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
