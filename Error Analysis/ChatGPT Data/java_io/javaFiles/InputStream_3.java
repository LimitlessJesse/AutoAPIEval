import java.io.FileInputStream;
import java.io.IOException;

public class InputStream_3 {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("example.txt")) {
            long bytesSkipped = inputStream.skip(5);
            System.out.println("Skipped " + bytesSkipped + " bytes");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
