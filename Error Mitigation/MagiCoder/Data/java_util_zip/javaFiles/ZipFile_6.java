import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ZipFile_6 {
    public static void main(String[] args) {
        try {
            ZipFile zipFile = new ZipFile("path_to_your_zip_file");
            Enumeration<? extends ZipEntry> entries = zipFile.entries();

            while (entries.hasMoreElements()) {
                ZipEntry entry = entries.nextElement();
                System.out.println(entry.getName());
            }

            zipFile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
