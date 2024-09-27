import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

public class ZipFile_3 {
    public static void main(String[] args) {
        try {
            ZipFile zipFile = new ZipFile("example.zip");
            ZipEntry entry = zipFile.getEntry("file.txt");
            InputStream inputStream = zipFile.getInputStream(entry);
            
            // Read from the input stream
            int data = inputStream.read();
            while(data != -1) {
                System.out.print((char) data);
                data = inputStream.read();
            }
            
            inputStream.close();
            zipFile.close();
        } catch (ZipException | IOException e) {
            e.printStackTrace();
        }
    }
}
