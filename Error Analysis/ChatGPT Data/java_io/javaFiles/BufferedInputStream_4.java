import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStream_4 {
    public static void main(String[] args) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("example.txt"))) {
            System.out.println("Available bytes: " + bis.available());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
