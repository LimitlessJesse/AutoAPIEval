import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import java.io.IOException;

public class ZipFile_4 {
    public static void main(String[] args) {
        try {
            ZipFile zipFile = new ZipFile("example.zip");
            ZipEntry entry = zipFile.getEntry("file.txt");
            if (entry != null) {
                InputStream inputStream = zipFile.getInputStream(entry);
                // Use the InputStream here
            }
            zipFile.close();
        } catch (ZipException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
