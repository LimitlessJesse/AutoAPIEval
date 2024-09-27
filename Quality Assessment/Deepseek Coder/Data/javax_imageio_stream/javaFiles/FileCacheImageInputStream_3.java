import javax.imageio.stream.FileCacheImageInputStream;
import java.io.File;
import java.io.IOException;

public class FileCacheImageInputStream_3 {
    public static void main(String[] args) {
        try {
            File file = new File("path_to_your_file");
            FileCacheImageInputStream fis = new FileCacheImageInputStream(file);

            byte[] b = new byte[100];
            int off = 0;
            int len = 50;

            int numBytesRead = fis.read(b, off, len);

            if(numBytesRead!= -1) {
                System.out.println("Bytes read: " + numBytesRead);
                System.out.println("Data: " + new String(b));
            } else {
                System.out.println("No data was read.");
            }

            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
