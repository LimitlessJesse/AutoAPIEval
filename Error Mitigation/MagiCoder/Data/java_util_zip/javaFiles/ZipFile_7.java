import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ZipFile_7 {
    public static void main(String[] args) {
        try {
            ZipFile zipFile = new ZipFile("path_to_your_zip_file.zip");
            ZipEntry zipEntry = zipFile.getEntry("name_of_your_zip_entry");
            InputStream inputStream = zipFile.getInputStream(zipEntry);
            // Now you can read from the inputStream
            // For example:
            int content;
            while ((content = inputStream.read())!= -1) {
                System.out.print((char) content);
            }
            inputStream.close();
            zipFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
