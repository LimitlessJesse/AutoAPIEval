import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStream_3 {
    public static void main(String[] args) {
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("example.txt"));
            long bytesSkipped = bis.skip(5);
            System.out.println("Number of bytes skipped: " + bytesSkipped);
            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
