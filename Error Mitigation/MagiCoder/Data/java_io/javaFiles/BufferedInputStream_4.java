import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStream_4 {
    public static void main(String[] args) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("file.txt"))) {
            long skippedBytes = bis.skip(10);
            System.out.println("Skipped " + skippedBytes + " bytes.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
