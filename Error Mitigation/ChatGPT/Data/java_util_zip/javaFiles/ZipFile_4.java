import java.io.IOException;
import java.util.zip.ZipFile;

public class ZipFile_4 {
    public static void main(String[] args) {
        try {
            ZipFile zipFile = new ZipFile("example.zip");
            // Perform operations with the zip file
            zipFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
