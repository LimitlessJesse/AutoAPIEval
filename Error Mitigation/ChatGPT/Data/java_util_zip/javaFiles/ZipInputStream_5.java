import java.io.IOException;
import java.util.zip.ZipInputStream;

public class ZipInputStream_5 {
    public static void main(String[] args) {
        try {
            ZipInputStream zipInput = new ZipInputStream(System.in);
            int available = zipInput.available();
            System.out.println("Available bytes: " + available);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
