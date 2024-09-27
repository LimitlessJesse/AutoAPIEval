import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ZipFile_1 {
    public static void main(String[] args) {
        try {
            ZipFile zipFile = new ZipFile("example.zip");
            ZipEntry entry = zipFile.getEntry("file.txt");
            
            if (entry != null) {
                System.out.println("Entry found: " + entry.getName());
            } else {
                System.out.println("Entry not found.");
            }
            
            zipFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
