import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipEntry_12 {
    public static void main(String[] args) {
        try {
            File file = new File("path_to_your_zip_file.zip");
            FileInputStream fis = new FileInputStream(file);
            ZipInputStream zis = new ZipInputStream(fis);
            ZipEntry ze = zis.getNextEntry();

            while (ze!= null) {
                System.out.println("File: " + ze.getName());
                System.out.println("Last Modified Time: " + ze.getTime());
                ze = zis.getNextEntry();
            }

            zis.closeEntry();
            zis.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
