import java.io.IOException;
import java.util.zip.ZipFile;

public class ZipFile_3 {
    public static void main(String[] args) {
        try {
            ZipFile zipFile = new ZipFile("example.zip");
            
            // Process zip file contents
            
            zipFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
