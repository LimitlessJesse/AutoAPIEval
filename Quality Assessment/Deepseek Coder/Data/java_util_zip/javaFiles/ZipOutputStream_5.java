import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipOutputStream;

public class ZipOutputStream_5 {
    public static void main(String[] args) {
        try {
            ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream("sample.zip"));
            // Add your code to write entries to the zipOut stream here
            //...

            // Close the ZipOutputStream
            zipOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
