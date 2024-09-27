import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ZipFile_2 {
    public static void main(String[] args) {
        try {
            ZipFile zipFile = new ZipFile("path_to_your_zip_file");
            ZipEntry zipEntry = zipFile.getEntry("name_of_your_file_inside_zip");
            InputStream inputStream = zipFile.getInputStream(zipEntry);
            
            // Now you can use the inputStream to read the content of the file
            //...
            
            // Don't forget to close the inputStream and the zipFile
            inputStream.close();
            zipFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
