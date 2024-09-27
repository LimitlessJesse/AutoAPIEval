import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStream_3 {
    public static void main(String[] args) {
        try {
            ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream("example.zip"));
            String comment = "This is a sample ZIP file comment.";
            zipOut.setComment(comment);
            zipOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
