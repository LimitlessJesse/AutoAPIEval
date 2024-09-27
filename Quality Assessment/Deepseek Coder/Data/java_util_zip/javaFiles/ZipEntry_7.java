import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ZipEntry_7 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("myZipFile.zip");
            ZipOutputStream zos = new ZipOutputStream(fos);
            ZipEntry entry = new ZipEntry("myFile.txt");
            entry.setMethod(ZipEntry.STORED); // Set the compression method to STORED (no compression)
            zos.putNextEntry(entry);
            // Write data to the entry
            zos.closeEntry();
            zos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
