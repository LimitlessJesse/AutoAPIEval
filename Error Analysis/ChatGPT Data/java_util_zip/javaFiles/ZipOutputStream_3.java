import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStream_3 {
    public static void main(String[] args) {
        String comment = "This is a comment for the zip file.";

        try (FileOutputStream fos = new FileOutputStream("example.zip");
             ZipOutputStream zos = new ZipOutputStream(fos)) {

            zos.setComment(comment);

            ZipEntry entry = new ZipEntry("example.txt");
            zos.putNextEntry(entry);
            zos.write("Hello, World!".getBytes());
            zos.closeEntry();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
