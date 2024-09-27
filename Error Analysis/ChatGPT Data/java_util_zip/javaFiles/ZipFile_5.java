import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ZipFile_5 {
    public static void main(String[] args) {
        try {
            ZipFile zipFile = new ZipFile("file.zip");
            int numEntries = zipFile.size();
            System.out.println("Number of entries in the zip file: " + numEntries);
            zipFile.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
