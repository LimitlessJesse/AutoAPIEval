import java.util.zip.ZipFile;
import java.util.zip.ZipException;
import java.io.File;

public class ZipFile_5 {
    public static void main(String[] args) {
        try {
            // Create a ZipFile object
            File file = new File("path_to_your_zip_file");
            ZipFile zipFile = new ZipFile(file);

            // Use the close() method
            zipFile.close();

        } catch (ZipException e) {
            e.printStackTrace();
        }
    }
}
