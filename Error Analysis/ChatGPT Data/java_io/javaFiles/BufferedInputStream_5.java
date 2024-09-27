import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStream_5 {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("example.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

            // Perform operations with BufferedInputStream

            bufferedInputStream.close();
            System.out.println("BufferedInputStream is closed.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
