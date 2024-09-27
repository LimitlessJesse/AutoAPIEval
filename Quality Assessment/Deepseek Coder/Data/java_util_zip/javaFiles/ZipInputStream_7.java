import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipInputStream_7 {
    public static void main(String[] args) {
        ZipInputStream zipInputStream = null;
        try {
            zipInputStream = new ZipInputStream(new FileInputStream("path_to_your_zip_file"));
            ZipEntry zipEntry = null;
            while ((zipEntry = zipInputStream.getNextEntry())!= null) {
                // process the entry
                System.out.println("Processing entry: " + zipEntry.getName());
                zipInputStream.closeEntry();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (zipInputStream!= null) {
                try {
                    zipInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
