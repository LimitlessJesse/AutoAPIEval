import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ZipEntry_13 {
    public static void main(String[] args) {
        try {
            ZipOutputStream zos = new ZipOutputStream(new FileOutputStream("test.zip"));
            ZipEntry ze = new ZipEntry("test.txt");
            ze.setTime(System.currentTimeMillis());
            zos.putNextEntry(ze);
            zos.closeEntry();
            zos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
