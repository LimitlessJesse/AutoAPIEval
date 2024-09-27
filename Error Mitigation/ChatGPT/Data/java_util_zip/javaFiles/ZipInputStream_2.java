import java.io.IOException;
import java.util.zip.ZipException;
import java.util.zip.ZipInputStream;

public class ZipInputStream_2 {
    public static void main(String[] args) {
        try {
            ZipInputStream zipInput = new ZipInputStream(/* input stream source */);
            zipInput.closeEntry();
        } catch (ZipException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
