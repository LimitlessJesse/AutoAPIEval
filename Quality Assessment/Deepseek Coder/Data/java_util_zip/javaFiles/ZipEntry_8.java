import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.io.IOException;

public class ZipEntry_8 {
    public static void main(String[] args) {
        try {
            ZipFile zipFile = new ZipFile("file.zip");
            ZipEntry ze = zipFile.getEntry("file.txt");
            int method = ze.getMethod();
            System.out.println("Method: " + method);
            zipFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
