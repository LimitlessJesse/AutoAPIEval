import java.io.IOException;
import java.util.zip.ZipOutputStream;

public class ZipOutputStream_2 {
    public static void main(String[] args) {
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(System.out);
            zipOutputStream.closeEntry();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
