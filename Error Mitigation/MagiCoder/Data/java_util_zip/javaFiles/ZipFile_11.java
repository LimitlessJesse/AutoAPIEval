import java.util.zip.ZipFile;
import java.io.IOException;

public class ZipFile_11 {
    public static void main(String[] args) {
        try {
            ZipFile zipFile = new ZipFile("path_to_your_zip_file");
            // do something with the zip file
            //...
            zipFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
