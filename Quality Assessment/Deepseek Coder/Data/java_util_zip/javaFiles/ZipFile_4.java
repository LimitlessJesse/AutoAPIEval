import java.util.zip.ZipFile;
import java.io.File;
import java.io.IOException;

public class ZipFile_4 {
    public static void main(String[] args) {
        try {
            ZipFile zipFile = new ZipFile(new File("path_to_your_zip_file"));
            int numberOfEntries = zipFile.size();
            System.out.println("Number of entries in the zip file: " + numberOfEntries);
            zipFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
