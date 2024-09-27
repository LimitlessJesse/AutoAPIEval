import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ZipOutputStream_1 {
    public static void main(String[] args) {
        try {
            ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream("example.zip"));
            ZipEntry entry = new ZipEntry("example.txt");
            zipOut.putNextEntry(entry);

            FileInputStream fileInput = new FileInputStream(new File("example.txt"));
            byte[] buffer = new byte[1024];
            int length;
            while ((length = fileInput.read(buffer)) >= 0) {
                zipOut.write(buffer, 0, length);
            }

            fileInput.close();
            zipOut.closeEntry();
            zipOut.close();
            System.out.println("File has been zipped successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
