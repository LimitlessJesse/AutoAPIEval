import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStream_5 {
    public static void main(String[] args) {
        try {
            ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream("example.zip"));
            zipOut.setLevel(6); // Setting compression level to 6
            ZipEntry entry = new ZipEntry("example.txt");
            zipOut.putNextEntry(entry);
            zipOut.closeEntry();
            zipOut.close();
            System.out.println("Zip file created successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
