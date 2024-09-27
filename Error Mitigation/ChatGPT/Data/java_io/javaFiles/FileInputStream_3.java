import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream_3 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("example.txt");
            byte[] buffer = new byte[10];
            int bytesRead = fis.read(buffer, 0, 10);
            System.out.println("Bytes read: " + bytesRead);
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
