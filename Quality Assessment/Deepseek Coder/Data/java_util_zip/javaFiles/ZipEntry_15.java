import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.io.IOException;

public class ZipEntry_15 {
    public static void main(String[] args) {
        try {
            ZipFile zipFile = new ZipFile("path/to/your/zip/file.zip");
            ZipEntry zipEntry = zipFile.getEntry("name_of_your_file_inside_zip");
            byte[] extra = zipEntry.getExtra();
            
            // Print the byte array
            for (byte b : extra) {
                System.out.print(b + " ");
            }
            
            zipFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
