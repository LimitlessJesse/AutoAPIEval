import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream_2 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("example.txt");
            byte[] buffer = new byte[1024];
            int bytesRead = fis.read(buffer);
            System.out.println("Total number of bytes read: " + bytesRead);
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
