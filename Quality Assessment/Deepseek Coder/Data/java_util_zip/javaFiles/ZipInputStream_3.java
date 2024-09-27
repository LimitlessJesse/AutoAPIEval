import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.ZipInputStream;

public class ZipInputStream_3 {
    public static void main(String[] args) {
        ZipInputStream zipInputStream = null;
        try {
            zipInputStream = new ZipInputStream(new FileInputStream("path_to_your_file.zip"));
            // Your code here
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (zipInputStream!= null) {
                    zipInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
