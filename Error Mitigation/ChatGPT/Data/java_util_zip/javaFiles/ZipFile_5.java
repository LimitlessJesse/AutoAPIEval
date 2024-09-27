import java.io.IOException;
import java.util.zip.ZipFile;

public class ZipFile_5 {
    public static void main(String[] args) {
        try {
            ZipFile zipFile = new ZipFile("example.zip");
            int numberOfEntries = zipFile.size();
            System.out.println("Number of entries in the ZIP file: " + numberOfEntries);
            zipFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
