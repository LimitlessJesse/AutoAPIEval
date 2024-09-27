import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.io.IOException;

public class ZipEntry_8 {
    public static void main(String[] args) {
        try {
            ZipFile zipFile = new ZipFile("path_to_your_zip_file.zip");
            ZipEntry zipEntry = zipFile.getEntry("name_of_your_zip_entry");
            long crc = zipEntry.getCrc();
            System.out.println("CRC: " + crc);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
