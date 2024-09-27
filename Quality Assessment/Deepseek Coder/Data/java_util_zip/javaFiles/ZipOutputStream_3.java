import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipOutputStream;

public class ZipOutputStream_3 {
    public static void main(String[] args) {
        String data = "Hello, World!";
        byte[] bytes = data.getBytes();

        try (ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream("test.zip"))) {
            zipOut.putNextEntry(zipOut.putNextEntry(new java.util.zip.ZipEntry("test.txt")));
            zipOut.write(bytes, 0, bytes.length);
            zipOut.closeEntry();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
