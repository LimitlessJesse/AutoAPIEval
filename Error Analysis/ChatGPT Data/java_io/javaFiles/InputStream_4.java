import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class InputStream_4 {
    public static void main(String[] args) {
        try {
            InputStream input = new FileInputStream("sample.txt");
            System.out.println("Available bytes: " + input.available());
            input.close();
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
