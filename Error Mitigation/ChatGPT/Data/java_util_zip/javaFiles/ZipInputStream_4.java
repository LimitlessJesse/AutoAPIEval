import java.io.IOException;
import java.util.zip.ZipInputStream;

public class ZipInputStream_4 {
    public static void main(String[] args) {
        try {
            ZipInputStream zipInput = new ZipInputStream(System.in);
            zipInput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
