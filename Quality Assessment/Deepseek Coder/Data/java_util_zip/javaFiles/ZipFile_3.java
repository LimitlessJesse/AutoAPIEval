import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.io.IOException;

public class ZipFile_3 {
    public static void main(String[] args) {
        try {
            ZipFile zipFile = new ZipFile("path_to_your_zip_file");
            ZipEntry zipEntry = zipFile.getEntry("name_of_the_entry_you_want_to_get");
            if (zipEntry!= null) {
                System.out.println("ZipEntry found: " + zipEntry.getName());
            } else {
                System.out.println("ZipEntry not found");
            }
            zipFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
