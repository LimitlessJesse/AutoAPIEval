import javax.imageio.stream.FileCacheImageInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileCacheImageInputStream_6 {
    public static void main(String[] args) {
        try {
            File file = new File("path_to_your_file");
            FileInputStream fis = new FileInputStream(file);
            FileCacheImageInputStream fcis = new FileCacheImageInputStream(fis);

            byte[] b = new byte[10];
            int off = 0;
            int len = 5;

            int bytesRead = fcis.read(b, off, len);

            System.out.println("Bytes read: " + bytesRead);
            for (int i = 0; i < bytesRead; i++) {
                System.out.print(b[i] + " ");
            }

            fcis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
