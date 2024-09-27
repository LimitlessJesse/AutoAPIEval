import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream_4 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("example.txt");
            long bytesSkipped = fis.skip(10);
            System.out.println("Number of bytes skipped: " + bytesSkipped);
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
