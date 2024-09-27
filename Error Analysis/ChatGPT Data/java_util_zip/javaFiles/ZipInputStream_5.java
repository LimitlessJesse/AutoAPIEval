import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipEntry;

public class ZipInputStream_5 {
    public static void main(String[] args) {
        try {
            ZipInputStream zipInput = new ZipInputStream(new FileInputStream("example.zip"));
            ZipEntry entry = zipInput.getNextEntry();
            int availableBytes = zipInput.available();
            System.out.println("Available bytes in the current zip entry: " + availableBytes);
            zipInput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
