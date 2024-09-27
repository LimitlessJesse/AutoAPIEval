import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ZipFile_1 {
    public static void main(String[] args) {
        try {
            // Create a new ZipFile instance
            ZipFile zipFile = new ZipFile(new File("path_to_your_zip_file"));

            // Get an enumeration of the zip file entries
            Enumeration<? extends ZipEntry> entries = zipFile.entries();

            // Iterate over the entries
            while (entries.hasMoreElements()) {
                ZipEntry entry = entries.nextElement();
                System.out.println("Entry name: " + entry.getName());
            }

            // Close the zip file
            zipFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
